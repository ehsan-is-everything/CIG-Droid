package com.example.activity;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import com.example.mahmoud.testak.MainActivity;

@RunWith(RobolectricTestRunner.class)
//@Config(manifest = "./src/main/AndroidManifest.xml")
@Config(sdk=23)
public class MainActivityTest {

	@org.junit.Test
	public void titleIsCorrect() throws Exception {
		Activity activity = Robolectric.setupActivity(MainActivity.class);
		assertTrue(activity.getTitle().toString().equals("Deckard"));
	}
	
}