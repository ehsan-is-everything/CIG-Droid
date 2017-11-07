package com.example.lab.testak_textinput;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
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
        final String resProperty = "./res";
        return new AndroidManifest(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty)) {
            @Override
            public int getTargetSdkVersion() {
                return MAX_SDK_SUPPORTED_BY_ROBOLECTRIC;
            }
        };
    }

}