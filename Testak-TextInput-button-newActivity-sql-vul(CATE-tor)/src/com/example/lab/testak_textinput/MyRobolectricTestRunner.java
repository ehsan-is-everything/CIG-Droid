package com.example.lab.testak_textinput;

import java.lang.annotation.Annotation;
import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import android.app.Application;

public class MyRobolectricTestRunner extends RobolectricTestRunner {

	@Override
	protected Config buildGlobalConfig() {
		return new Config() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Class<?>[] shadows() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int[] sdk() {
				// TODO Auto-generated method stub
				return new int[]{26};
			}
			
			@Override
			public String resourceDir() {
				// TODO Auto-generated method stub
				return "res";
			}
			
			@Override
			public String qualifiers() {
				// TODO Auto-generated method stub
				return Config.DEFAULT_QUALIFIERS;
			}
			
			@Override
			public String packageName() {
				// TODO Auto-generated method stub
				return "/media/ehsan/a2c41319-a56d-4856-b979-aeaebaea4e50/Programs/SPF-Android/Ver 1.0.0/Testak-TextInput-button-sql-vul/app/build/intermediates/classes/debug/com/example/lab/testak_textinput";
			}
			
			@Override
			public int minSdk() {
				// TODO Auto-generated method stub
				return 15;
			}
			
			@Override
			public int maxSdk() {
				// TODO Auto-generated method stub
				return 26;
			}
			
			@Override
			public String manifest() {
				// TODO Auto-generated method stub
				return "AndroidManifest.xml";
			}
			
			@Override
			public String[] libraries() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] instrumentedPackages() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Class<?> constants() {
				// TODO Auto-generated method stub
				return BuildConfig.class;
			}
			
			@Override
			public String buildDir() {
				// TODO Auto-generated method stub
				return "build";
			}
			
			@Override
			public String assetDir() {
				// TODO Auto-generated method stub
				return "assets";
			}
			
			@Override
			public Class<? extends Application> application() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String abiSplit() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	public MyRobolectricTestRunner(Class<?> arg0) throws InitializationError {
		super(arg0);
	}

}
