package ICFG;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.xmlpull.v1.XmlPullParserException;

import soot.Context;
import soot.MethodOrMethodContext;
import soot.SootMethod;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.callgraph.Targets;

/**
 * @author ehsan
 *
 */
public class Test {
	
	/**
	 * @param args
	 *            args[0]::APKAddress. args[1]::AndroidJar file in SDK. args[2]::address
	 *            to result folder for dummy main.
	 * @throws IOException
	 * @throws XmlPullParserException
	 */
	public static void main(String[] args) throws IOException, XmlPullParserException {
		//CallGraph cfg = ExtractCFG.analyzeAPKFile(args[0], args[1]);
		CallGraph cfg= ExtractICFG.bestPathes(args[0], args[1]);
		ExtractICFG.serializeCallGraph(cfg, 0, args[2]);
		
		//Iterator<Edge> it= cfg.
		//visit(cfg,cfg.)
		
		//ExtractCFG.printDummyMain();
		//ExtractCFG.serializeDummyMain(args[3]);
		System.out.println();

	}
	
	

}
