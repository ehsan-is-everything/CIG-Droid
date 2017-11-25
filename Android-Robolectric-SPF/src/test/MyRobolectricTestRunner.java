package test;

import org.junit.runners.model.InitializationError;
<<<<<<< HEAD
import org.robolectric.AndroidManifest;
=======
import org.robolectric.manifest.AndroidManifest;
>>>>>>> ae7c451601287d6a9c7c6cd0c669cfbfb64c77ce
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;

public class MyRobolectricTestRunner extends RobolectricTestRunner{
	private static final int MAX_SDK_SUPPORTED_BY_ROBOLECTRIC = 18;

	public MyRobolectricTestRunner(Class<?> arg0) throws InitializationError {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	@Override
    protected AndroidManifest getAppManifest(Config config) {
        final String manifestProperty = "./AndroidManifest.xml";
        final String resProperty = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/build/intermediates/res/merged/debug";
<<<<<<< HEAD
        return new AndroidManifest(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty)) {
=======
        return new AndroidManifest(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty),null) {
>>>>>>> ae7c451601287d6a9c7c6cd0c669cfbfb64c77ce
            @Override
            public int getTargetSdkVersion() {
                return MAX_SDK_SUPPORTED_BY_ROBOLECTRIC;
            }
        };
    }

}
