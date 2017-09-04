package ICFG;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import soot.jimple.toolkits.callgraph.CallGraph;

/**
 * @author ehsan
 *
 */
public class Test {

	/**
	 * @param args
	 *            args[0]::APKAddress. args[1]::AndroidJar file in SDK. args[2]::address
	 *            to dot file. args[3]::address to dummyMain file.
	 * @throws IOException
	 * @throws XmlPullParserException
	 */
	public static void main(String[] args) throws IOException, XmlPullParserException {
		CallGraph cfg = ExtractCFG.analyzeAPKFile(args[0], args[1]);
		ExtractCFG.serializeCallGraph(cfg, 0, args[2]);
		// ExtractCFG.printDummyMain();
		ExtractCFG.serializeDummyMain(args[3]);
		System.out.println();

	}

}
