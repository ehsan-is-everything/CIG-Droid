package com.example.lab.testak_textinput;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import gov.nasa.jpf.symbc.Debug;

public class MainActivity extends AppCompatActivity {
	//EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = /* ( */new Toolbar();// ) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		//EditText et=/*(*/new EditText();//) findViewById(R.id.editText);
		Debug.printPC("first:");
		EditText et = (EditText) Debug.makeSymbolicRef("et", new EditText());
		Debug.printPC("second:");
		Debug.printSymbolicRef(et, "EditText!!!");
		int st = Integer.parseInt(et.getText().toString());
		//st=Debug.makeSymbolicInteger("st");
		if (st == 'a') {
			assert (false);
		}

		View fab = findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null)
						.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		// noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
