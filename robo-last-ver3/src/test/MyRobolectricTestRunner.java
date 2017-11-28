package test;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.manifest.AndroidManifest;
import org.robolectric.res.Fs;

public class MyRobolectricTestRunner extends RobolectricTestRunner{
	private static final int MAX_SDK_SUPPORTED_BY_ROBOLECTRIC = 21;

	public MyRobolectricTestRunner(Class<?> arg0) throws InitializationError {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	@Override
    protected AndroidManifest getAppManifest(Config config) {
        final String manifestProperty = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/src/main/AndroidManifest.xml";
       final String resProperty = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/build/intermediates/res/merged/debug";
       // final String resProperty = "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/src/main/res/";
        final String assetProperty ="/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/src/main/assets/";
        return new AndroidManifest(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty), Fs.fileFromPath(assetProperty)) {
            @Override
            public int getTargetSdkVersion() {
                return MAX_SDK_SUPPORTED_BY_ROBOLECTRIC;
            }
        };
    }

}
