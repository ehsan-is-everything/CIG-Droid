package com.example.lab.testak_textinput;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import com.example.lab.testak_textinput.MainActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;


@RunWith(MyRobolectricTestRunner.class)
//@Config(emulateSdk = 18, reportSdk = 18)
//@Config(emulateSdk=18, manifest = "./AndroidManifest.xml")
//@Config(emulateSdk=18)
//@Config(constants = BuildConfig.class);
public class DummyMain {

	@Test
	public void theGreatTest(){
		System.out.println("Starting function calls");
		MainActivity ma=Robolectric.setupActivity(MainActivity.class);
		ma.findViewById(R.id.button).performClick();
        System.out.println("Finished with function calls");
	}
}

