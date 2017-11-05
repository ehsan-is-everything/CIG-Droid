package ICFG;

import java.io.BufferedReader;
import java.io.BufferedWriter;

/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.xmlpull.v1.XmlPullParserException;

import soot.MethodOrMethodContext;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.jimple.infoflow.android.SetupApplication;
import soot.jimple.infoflow.results.InfoflowResults;
import soot.jimple.infoflow.taintWrappers.EasyTaintWrapper;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.callgraph.Targets;
import soot.util.dot.DotGraph;
import soot.util.queue.QueueReader;

/**
 * @author ehsan
 *
 */
public class ExtractCFG {
	private static String FileAddress = null;
	private static LinkedList<Stack<SootMethod>> bestPathes = new LinkedList<>();
	private static SetupApplication setupApplication;

	private static HashMap<Integer, String> listofInputEntries = new HashMap<>();

	private static void WriteResultsToFile(String result) {
		// The name of the file to open.
		String fileName = FileAddress;

		try (PrintWriter out = new PrintWriter(fileName)) {
			out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("CANT WRITE RESULTS IN FILE!!!!");
		}

	}

	/**
	 * Analyzes the given APK file for extracting CFG of App.
	 * 
	 * @param APKAddress
	 *            The full path and file name of the APK file to analyze
	 * @param androidJar
	 *            The full path and file name to android.jar file in SDK
	 * @return The CFG of the given APK file
	 * @throws IOException
	 *             Thrown if the given APK file or any other required file could not
	 *             be found
	 * @throws XmlPullParserException
	 *             Thrown if the Android manifest file could not be read.
	 */
	public static CallGraph analyzeAPKFile(String APKAddress, String androidJar)
			throws IOException, XmlPullParserException {
		return analyzeAPKFile(APKAddress, androidJar, false, true, false);
	}

	/**
	 * Analyzes the given APK file for data flows
	 * 
	 * @param fileName
	 *            The full path and file name of the APK file to analyze
	 * @param androidJar
	 *            The full path and file name to android.jar file in SDK
	 * @param enableImplicitFlows
	 *            True if implicit flows shall be tracked, otherwise false
	 * @param enableStaticFields
	 *            True if taints in static fields shall be tracked, otherwise false
	 * @param flowSensitiveAliasing
	 *            True if a flow-sensitive alias analysis shall be used, otherwise
	 *            false
	 * @return The data leaks found in the given APK file
	 * @throws IOException
	 *             Thrown if the given APK file or any other required file could not
	 *             be found
	 * @throws XmlPullParserException
	 *             Thrown if the Android manifest file could not be read.
	 */
	public static CallGraph analyzeAPKFile(String fileName, String androidJars, boolean enableImplicitFlows,
			boolean enableStaticFields, boolean flowSensitiveAliasing) throws IOException, XmlPullParserException {

		if (androidJars == null)
			androidJars = System.getProperty("ANDROID_JARS");
		if (androidJars == null)
			throw new RuntimeException("Android JAR dir not set");
		System.out.println("Loading Android.jar files from " + androidJars);

		setupApplication = new SetupApplication(androidJars, fileName);

		// Find the taint wrapper file
		File taintWrapperFile = new File("EasyTaintWrapperSource.txt");
		if (!taintWrapperFile.exists())
			taintWrapperFile = new File("../soot-infoflow/EasyTaintWrapperSource.txt");
		setupApplication.setTaintWrapper(new EasyTaintWrapper(taintWrapperFile));

		// Configure the analysis
		setupApplication.getConfig().setEnableImplicitFlows(enableImplicitFlows);
		setupApplication.getConfig().setEnableStaticFieldTracking(enableStaticFields);
		setupApplication.getConfig().setFlowSensitiveAliasing(flowSensitiveAliasing);
		setupApplication.constructCFG();
		// InfoflowResults res = setupApplication.runInfoflow("SourcesAndSinks.txt");
		// System.out.println(res.size());
		// res.printResultsToConsole();
		return Scene.v().getCallGraph();

	}

	public static void bestPathes(String fileName, String androidJars, String AppInputsFileAddress)
			throws IOException, XmlPullParserException {
		FileAddress = AppInputsFileAddress;

		CallGraph cfg = analyzeAPKFile(fileName, androidJars);

		Iterator<Edge> it = cfg.iterator();

		ArrayList<SootMethod> listofTargetMethods = new ArrayList<>();

		while (it.hasNext()) {
			Edge e = it.next();
			String acvtiveBodyOfCurrentMethod = e.getSrc().method().retrieveActiveBody().toString();
			if (acvtiveBodyOfCurrentMethod.contains("rawQuery")
					|| acvtiveBodyOfCurrentMethod.contains("rawQueryWithFactory")
					|| acvtiveBodyOfCurrentMethod.contains("query")
					|| acvtiveBodyOfCurrentMethod.contains("queryWithFactory")
					|| acvtiveBodyOfCurrentMethod.contains("delete")
					|| acvtiveBodyOfCurrentMethod.contains("updateWithOnConflict")
					|| acvtiveBodyOfCurrentMethod.contains("execSQL")
					|| acvtiveBodyOfCurrentMethod.contains("update")) {
				SootMethod targetMethod = e.getSrc().method();
				if (!listofTargetMethods.contains(targetMethod))
					listofTargetMethods.add(targetMethod);
			}
			// System.out.print("KIND::" + e.kind() + " SRC STM:: " +
			// e.getSrc().method().retrieveActiveBody());
			// System.out.println(" TRG::" + e.tgt().getName() + "\n");
		}

		for (SootMethod targetMethod : listofTargetMethods) {
			Stack<SootMethod> stack = new Stack<>();
			stack.push(targetMethod);
			visit(cfg, stack);
			bestPathes.add(stack);
		}
	}

	private static void visit(CallGraph cg, Stack<SootMethod> stack) {

		// iterate over unvisited parents
		Iterator<Edge> ptargets = cg.edgesInto(stack.peek());
		// String s=stack.peek().getDeclaringClass().getJavaPackageName();
		// String s=stack.peek().getDeclaringClass().getJavaStyleName();

		if (ptargets != null) {
			while (ptargets.hasNext()) {
				Edge p = (Edge) (ptargets.next());
				SootMethod sm = p.getSrc().method();
				if (sm.getName().equals("dummyMainMethod")) {
					stack.push(sm);
					makeSPFdummyMainInfo(stack);
					return;
				}

				// if (!stack.peek().getSignature().equals(p.getSignature())) {
				stack.push(sm);
				visit(cg, stack);
				// }
			}
		}

		// iterate over unvisited children
		/*
		 * Iterator<MethodOrMethodContext> ctargets = new Targets(cg.edgesOutOf(k));
		 * 
		 * 
		 * if (ctargets != null) { while (ctargets.hasNext()) { SootMethod c =
		 * (SootMethod) ctargets.next(); if (c == null) System.out.println("c is null");
		 * // dot.drawEdge(identifier, c.getName());
		 * 
		 * 
		 * if (!visited.containsKey(c.getSignature())) visit(cg, c); } }
		 */
	}

	private static void makeSPFdummyMainInfo(Stack<SootMethod> stack) {
		SootMethod SootDummyMain = stack.pop();

		String result = "This is Static information for building SPF dummyMain class::\n\n\n";
		int counter = 1;

		while (!stack.isEmpty()) {
			SootMethod currentMethod = stack.pop();
			String className = currentMethod.getDeclaringClass().getJavaStyleName();
			if (className.contains("$")) {
				String parentClassName = className.substring(0, className.indexOf('$'));
				SootClass currentClass = hasClass(parentClassName);
				if (currentClass != null) {
					List<SootMethod> list = currentClass.getMethods();
					for (SootMethod sm : list) {
						if (sm.getActiveBody().toString().contains(className)) {
							result = +counter + ") \"LISTENER\" Method :: " + currentMethod.getName() + " in "
									+ className + " that declares in " + sm.getName() + " from Class:: "
									+ sm.getDeclaringClass().getJavaPackageName() + "."
									+ sm.getDeclaringClass().getJavaStyleName() + "\n\n"
									+ "Find findViewById(#int) method in following code related to " + className
									+ "\n\nActive Body of this Method in Jimple is::\n\n"
									+ sm.getActiveBody().toString() + "\n\n";
						}
					}
				}
			} else {
				result = +counter + ") \"NORMAL\" Method :: " + currentMethod.getDeclaringClass().getJavaStyleName()
						+ "from Class:: " + currentMethod.getDeclaringClass().getJavaPackageName() + "\n\n";
			}
			counter++;
		}
		System.out.println(result);
		WriteResultsToFile(result);
	}

	private static SootClass hasClass(String className) {
		Iterator<SootClass> it = Scene.v().getApplicationClasses().iterator();
		while (it.hasNext()) {
			SootClass current = it.next();
			if (current.getJavaStyleName().equals(className))
				return current;
		}
		return null;
	}

	/**
	 * @return dummyMain method generated by Soot
	 */
	public static SootMethod getEntryPoint() {
		return setupApplication.getDummyMainMethod();
	}

	public static void printDummyMain() {
		System.out.println(setupApplication.getDummyMainMethod().getActiveBody().toString());
	}

	/**
	 * @param fileAddress
	 *            The full path and file name of the dummyMain file to save for
	 *            future analysis.
	 * @throws FileNotFoundException
	 */
	public static void serializeDummyMain(String fileAddress) throws FileNotFoundException {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileAddress));
			out.write(setupApplication.getDummyMainMethod().getActiveBody().toString());
			out.close();
		} catch (IOException e) {
			System.out.println("ERROR::Can not Create dummyMain file!!! ");

		}
	}

	/**
	 * @param graph
	 *            The CFG extracted by Soot.
	 * @param ID
	 *            Number of generated graph
	 * @param fileName
	 *            The full path and file name of the dot file to draw with graphViz
	 * @return
	 */
	public static File serializeCallGraph(CallGraph graph, int ID, String fileName) {
		if (fileName == null) {
			fileName = soot.SourceLocator.v().getOutputDir();
			if (fileName.length() > 0) {
				fileName = fileName + java.io.File.separator;
			}
			fileName = fileName + "call-graph" + ID + DotGraph.DOT_EXTENSION;
		}
		DotGraph canvas = new DotGraph("call-graph");
		QueueReader<Edge> listener = graph.listener();
		while (listener.hasNext()) {
			Edge next = listener.next();

			MethodOrMethodContext src = next.getSrc();
			MethodOrMethodContext tgt = next.getTgt();
			canvas.drawNode(src.toString()
			// src.method().getJavaSourceStartLineNumber()
			);
			canvas.drawNode(tgt.toString()
			// +tgt.method().getJavaSourceStartLineNumber()
			);
			canvas.drawEdge(src.toString(), tgt.toString());

		}
		canvas.plot(fileName);
		return new File(fileName);
	}
}
