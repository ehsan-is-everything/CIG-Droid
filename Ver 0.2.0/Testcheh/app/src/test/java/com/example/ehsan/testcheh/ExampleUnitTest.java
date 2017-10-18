package com.example.ehsan.testcheh;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MyRobolectricRunner.class)
@Config(constants = BuildConfig.class)

public class ExampleUnitTest {

    @Test
    public void titleIsCorrect() throws Exception {
        Activity ma = Robolectric.setupActivity(MainActivity.class);
        Button b= ma.findViewById(R.id.button_submit);
        EditText et =ma.findViewById(R.id.edit_text);
        b.performClick();
        assertEquals(ma.getTitle(), et.getText().toString());
    }

//    public static void main(String[] args) {
//        ExampleUnitTest t = new ExampleUnitTest();
//        try {
//            t.titleIsCorrect();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}