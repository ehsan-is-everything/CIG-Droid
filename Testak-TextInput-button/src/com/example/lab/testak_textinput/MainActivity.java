package com.example.lab.testak_textinput;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import gov.nasa.jpf.symbc.Debug;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = new Toolbar();// (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		EditText et = (EditText) Debug.makeSymbolicRef("et", new EditText());// (EditText) findViewById(R.id.editText);
		final String st = et.getText().toString();

		View fab = findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null)
						.show();
			}
		});

		View b = findViewById(R.id.button);
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			// public void onClick(View v) {
			// if(st.charAt(0)!='a') {
			// assert(false);
			// }
			// }
			// });
			public void onClick(View v) {
				boolean akbar = Debug.makeSymbolicBoolean("akbar");
				int fake = Debug.makeSymbolicInteger("fake");
				// db.execSQL("SELECT * FROM student where stdno='"+st+"'");
//				if (st.equals("a")) {
//					assert (false);
//				} else if (st.equals("b")) {
//					System.out.println("gav");
//				} else {
//					// Log.e("aa","aa");
//					System.out.println("khar");
//				}
				if(akbar && fake != 8888) {
					System.err.println("then Branch reached!!!");
				}else {
					//System.out.println("else Branch reached!!!");
					assert(false);
				}

//				switch (st.charAt(0)) {
//				case 'v':
//					break;
//				case 'd':
//					break;
//				case 'h': {
//					assert(false);
//					break;
//				}
//				default:
//					break;
//				}
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
