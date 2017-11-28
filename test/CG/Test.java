package CG;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

	private static final int MAX_APK_SIZE = 2500000;
	/**
	 * @param args
	 *            args[0]::APKAddress. args[1]::AndroidJar file in SDK.
	 *            args[2]::address to result folder for dummy main.
	 * @throws IOException
	 * @throws XmlPullParserException
	 */
	private static final int MAX_NUMBER_OF_TARGETAPKS = 100;
	private static final boolean DEBUG_MOD = true;
	// private static String targetAPKDir =
	// "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/APK-SRC/f-droid";
	private static String targetAPKDir = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/APK-SRC/f-droid-debug";
	private static String resultDir = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/f-droid-debug/";
	// private static String resultDir =
	// "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/f-droid/";
	private static String androidJar = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/Android/android-sdk-linux/platforms/android-26/android.jar";
	private static String soot_log_path = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/soot-log";
	private static int maybeHasVul = 0;

	public static void main(String[] args) throws IOException, XmlPullParserException {

		ArrayList<String> apkList = getAllApkNames();
		for (String apkFullPath : apkList) {
			String resDir = mkDir(apkFullPath);
			try {
				System.err.println(apkFullPath);
				ExtractCG.bestPathes(apkFullPath, androidJar, resDir);
			} catch (Exception e) {
				System.err.println("exception in " + apkFullPath + " !!!!");
			}
			rmDir(resDir);
			storeApkPathAsProcess(apkFullPath);
			if (maybeHasVul > MAX_NUMBER_OF_TARGETAPKS) {
				break;
			}
		}
		// CallGraph cfg = ExtractCFG.analyzeAPKFile(args[0], args[1]);

		// ExtractCFG.serializeCallGraph(cfg, 0, args[2]);

		// Iterator<Edge> it= cfg.
		// visit(cfg,cfg.)

		// ExtractCFG.printDummyMain();
		// ExtractCFG.serializeDummyMain(args[3]);
		System.out.println();

	}

	private static void storeApkPathAsProcess(String apkFullPath) {
		try {
			if (!DEBUG_MOD)
				Files.write(Paths.get(soot_log_path), (apkFullPath + "\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.err.println("ERROR in writing to soot log file!!!");
		}
	}

	private static ArrayList<String> getAllApkNames() {
		ArrayList<String> pervProcessApks = readFromSootLog();
		File folder = new File(targetAPKDir);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> listOfFilesName = new ArrayList<String>(listOfFiles.length);

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile() && listOfFiles[i].length() <= MAX_APK_SIZE) {
				String path = listOfFiles[i].getAbsolutePath();
				String extension = path.substring(path.lastIndexOf("."));
				String apkName = path.replace(extension, "").substring(path.lastIndexOf("/") + 1);
				if (apkName != "" && extension.equals(".apk") && !pervProcessApks.contains(path))
					listOfFilesName.add(path);
			}
		}

		return listOfFilesName;

	}

	private static ArrayList<String> readFromSootLog() {
		try {
			ArrayList<String> res = new ArrayList<>();
			if (DEBUG_MOD)
				return res;
			File file = new File(soot_log_path);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				res.add(line);
			}
			fileReader.close();
			return res;
		} catch (IOException e) {
			System.err.println("ERROR in reading from soot-log file!!!");
		}
		return null;
	}

	private static String mkDir(String fullPath) {
		String apkName = (fullPath.substring(fullPath.lastIndexOf("/") + 1));
		apkName = apkName.substring(0, apkName.lastIndexOf("."));
		String resultDirPath = resultDir + apkName;
		File theDir = new File(resultDirPath);
		boolean result = false;
		if (!theDir.exists()) {
			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				System.out.println("Exception in Creating result DIR!!::\"" + apkName + "\"");
			}
		}
		return resultDirPath + "/";

	}

	private static boolean rmDir(String fullPath) {
		File theDir = new File(fullPath);
		boolean result = false;
		if (theDir.exists()) {
			try {
				if (theDir.listFiles().length == 0)
					result = theDir.delete();
				else {
					maybeHasVul++;
				}
			} catch (SecurityException se) {
				System.out.println("Exception in Deleteing result DIR!!::\"" + fullPath + "\"");
			}
		}
		return result;

	}

}
