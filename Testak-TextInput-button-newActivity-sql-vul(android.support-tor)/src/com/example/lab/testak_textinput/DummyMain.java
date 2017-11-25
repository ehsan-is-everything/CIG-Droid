package com.example.lab.testak_textinput;

import com.example.lab.testak_textinput.MainActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;


public class DummyMain {

	public static void main(String[] args) {
		MainActivity ma=new MainActivity();
		ma.onCreate(null);
		ma.findViewById(R.id.button).performClick();
	}
}

