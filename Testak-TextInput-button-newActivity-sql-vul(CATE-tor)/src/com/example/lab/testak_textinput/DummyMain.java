package com.example.lab.testak_textinput;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import com.example.lab.testak_textinput.MainActivity;



@RunWith(RobolectricTestRunner.class)
@Config(manifest = "AndroidManifest.xml"
,buildDir="build"
//,sdk=23
//,minSdk=15
//,maxSdk=26
//,qualifiers=""
,resourceDir="res"
,constants=BuildConfig.class
//,packageName="com.example.lab.testak_textinput"
)
public class DummyMain {

	@Test
	public void theGreatTest() {
		System.out.println("Starting dummyMain");
		MainActivity ma = Robolectric.setupActivity(MainActivity.class);
		ma.findViewById(R.id.button).performClick();
		System.out.println("Finished with dummyMain");
	}
}
