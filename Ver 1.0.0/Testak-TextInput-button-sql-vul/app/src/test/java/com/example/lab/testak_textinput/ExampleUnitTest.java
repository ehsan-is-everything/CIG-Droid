package com.example.lab.testak_textinput;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.util.Logger;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MyRobolectricRunner.class)
@Config(constants = BuildConfig.class)
public class ExampleUnitTest {
    @Test
    public void SqliInjection_Exploitability() throws Exception {
        Activity ma = Robolectric.setupActivity(MainActivity.class);
        Button b= (Button) ma.findViewById(R.id.button);
        EditText et = (EditText) ma.findViewById(R.id.editText);
        TextView tv = (TextView) ma.findViewById(R.id.textview);
        et.setText("a' or '1'='1");
        b.performClick();

        Logger.error((String) tv.getText(),null);

    }
}