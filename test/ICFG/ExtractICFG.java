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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.xmlpull.v1.XmlPullParserException;

import soot.MethodOrMethodContext;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.infoflow.android.SetupApplication;
import soot.jimple.infoflow.results.InfoflowResults;
import soot.jimple.infoflow.solver.cfg.InfoflowCFG;
import soot.jimple.infoflow.taintWrappers.EasyTaintWrapper;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.callgraph.Targets;
import soot.jimple.toolkits.ide.icfg.BiDiInterproceduralCFG;
import soot.toolkits.graph.DirectedGraph;
import soot.util.dot.DotGraph;
import soot.util.queue.QueueReader;

/**
 * @author ehsan
 *
 */
public class ExtractICFG {
	// private static final int ASSERT_ERROR_BASE = 2;
	private static String dmFolderAddress = null;
	private static SetupApplication setupApplication;
	private static int counter = 1;
	public static ArrayList<PathInfo> AllTrgtInfoPathes = new ArrayList<>();

	private static void WriteResultsToFile(String result) {
		// The name of the file to open.
		String fileName = dmFolderAddress + "dummyMain" + counter;
		counter++;

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
		// setupApplication.setTaintWrapper(new EasyTaintWrapper(taintWrapperFile));

		// Configure the analysis
		setupApplication.getConfig().setEnableImplicitFlows(enableImplicitFlows);
		setupApplication.getConfig().setEnableStaticFieldTracking(enableStaticFields);
		setupApplication.getConfig().setFlowSensitiveAliasing(flowSensitiveAliasing);
		setupApplication.constructCFG();
		// setupApplication.calculateSourcesSinksEntrypoints(Collections.emptySet(),
		// Collections.emptySet());
		return Scene.v().getCallGraph();

		// InfoflowCFG iCFG=new InfoflowCFG();
		// System.out.println(res.size());
		// res.printResultsToConsole();
		// return Scene.v().getCallGraph();

	}

	public static CallGraph bestPathes(String fileName, String androidJars) throws IOException, XmlPullParserException {

		CallGraph cg = analyzeAPKFile(fileName, androidJars);

		Iterator<Edge> it = cg.iterator();

		ArrayList<SootMethod> listofTargetMethods = new ArrayList<>();

		while (it.hasNext()) {
			Edge e = it.next();
			SootMethod sm = e.getSrc().method();
			// String acvtiveBodyOfCurrentMethod = sm.retrieveActiveBody().toString();
			String SigOfCurrentMethod = sm.getSignature();

			if (SigOfCurrentMethod.contains("AssertionError")) {
				if (!listofTargetMethods.contains(sm)) {
					// sm.setweight(1);
					listofTargetMethods.add(sm);
				}
			}
		}

		for (SootMethod targetMethod : listofTargetMethods) {
			PathInfo tmp = new PathInfo();
			visitCallGraph(targetMethod, tmp);
			AllTrgtInfoPathes.add(tmp);
		}
		return cg;
	}

	private static void visitCallGraph(SootMethod targetMethod, PathInfo tmp) {
		InfoflowCFG icfg = new InfoflowCFG();
		Collection<Unit> uc = icfg.getCallersOf(targetMethod);
		Iterator<Unit> uit = uc.iterator();
		while (uit.hasNext()) {
			Unit u = uit.next();
			visitCFG(u, icfg, tmp);
		}
	}

	private static void visitCFG(Unit u, InfoflowCFG icfg, PathInfo tmp) {
		if (icfg.getMethodOf(u).getName().equals("dummyMainMethod")) {
			return;
		}
		List<Unit> lu = icfg.getPredsOf(u);// list of units
		Iterator<Unit> puitr = lu.iterator();
		while (puitr.hasNext()) {// There is two state 1-call stmt=>ignore 2-retun=> not posible 3-branch=>hoora
									// 4-common Unit=> Its OK
			Unit parent = puitr.next();
			String methodSig = icfg.getMethodOf(parent).getSignature();
			if (tmp.getStackTraceOfMethods().isEmpty())
				tmp.getStackTraceOfMethods().push(methodSig);
			else if(!tmp.getStackTraceOfMethods().peek().equals(methodSig))
				tmp.getStackTraceOfMethods().push(methodSig);
			if (parent.branches()) {
				System.out.println(u);
				// process of then or else
				boolean thenOrElse = true;
				SootMethod nn=icfg.getMethodOf(parent);
				IfStmtInfo stm = new IfStmtInfo(parent.toString(), icfg.getPredsOf(parent).get(0).toString(), thenOrElse);
				tmp.getMap().put(parent.toString(), stm);
			} else if (icfg.isStartPoint(parent)) {
				// parent method shoud be analyzed
				// this sootmetod is finished
				// fin condition
				System.out.println("entry point of" + icfg.getMethodOf(parent));
				Collection<Unit> ListOfCallers = icfg.getCallersOf(icfg.getMethodOf(parent));
				Iterator<Unit> citr = ListOfCallers.iterator();
				while (citr.hasNext()) {
					visitCFG(citr.next(), icfg, tmp);
				}
			} else {
				System.out.println("Usual Unit" + parent);
				visitCFG(parent, icfg, tmp);
			}
		}
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
				result = +counter + ") \"NORMAL\" Method :: " + currentMethod.getName() + " from Class:: "
						+ currentMethod.getDeclaringClass().getJavaPackageName() + "."
						+ currentMethod.getDeclaringClass().getJavaStyleName() + "\n\n";
			}
			counter++;
		}
		// System.out.println(result);
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
			// System.out.println(next.getSrc().method().getName() + "=" +
			// next.getSrc().method().getweight());
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
