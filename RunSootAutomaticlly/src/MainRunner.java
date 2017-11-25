import java.io.File;
import java.io.IOException;

public class MainRunner {
	private static final int MAX_NUMBER_OF_PROCESS = 100;
	private String targetAPKDir = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/APK-SRC/f-droid";
	private String resultDir = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/f-droid/";
	private String androidJar = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/Android/android-sdk-linux/platforms/android-26/android.jar";
	private String sootJarPath = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/git/CIG-Droid/run/soot.jar";
	private int processCounter;

	private String[] getAllApkNames() {
		File folder = new File(targetAPKDir);
		File[] listOfFiles = folder.listFiles();
		String[] listOfFilesName = new String[listOfFiles.length];

		for (int i = 0; i < listOfFiles.length; i++) {
			listOfFilesName[i] = listOfFiles[i].getAbsolutePath();
		}

		return listOfFilesName;

	}

	private String mkDir(String fullPath) {
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
		return resultDirPath+"/";

	}

	private boolean rmDir(String fullPath) {
		File theDir = new File(fullPath);
		boolean result = false;
		if (theDir.exists()) {
			try {
				if (theDir.listFiles().length == 0)
					result = theDir.delete();
			} catch (SecurityException se) {
				System.out.println("Exception in Deleteing result DIR!!::\"" + fullPath + "\"");
			}
		}
		return result;

	}

	private void runSoot(String apkPath, String resDir) {
		// String[] args = new String[] { "/bin/bash", "-c", "java -jar", sootJarPath,
		// apkPath, androidJar, resDir };
		String proc = "java -jar " + sootJarPath + " \"" + apkPath + "\" \"" + androidJar + "\" \"" + resDir + "\"";
		try {
//			if (processCounter < MAX_NUMBER_OF_PROCESS) {
//				processCounter++;
//				int exit = Runtime.getRuntime().exec(proc).exitValue();
//				if (exit == 0) {
//					processCounter--;
//				}
//			} else {
				int exit = Runtime.getRuntime().exec(proc).waitFor();
//				if (exit == 0) {
//					processCounter--;
//				}
//			}
		} catch (IOException e) {
			System.err.println("can not process this command:" + proc.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void doYourJob() {
		String[] apkList = getAllApkNames();
		for (String apkFullPath : apkList) {
			String resDir = mkDir(apkFullPath);
			runSoot(apkFullPath, resDir);
			rmDir(resDir);
		}
	}

	public static void main(String[] args) {
		MainRunner mr = new MainRunner();
		mr.doYourJob();
	}

}
