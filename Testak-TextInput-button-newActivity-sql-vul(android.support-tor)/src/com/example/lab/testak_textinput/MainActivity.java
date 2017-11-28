package com.example.lab.testak_textinput;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import android.widget.TextView;
//import gov.nasa.jpf.symbc.Debug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
///home/ehsan/.m2/repository/org/robolectric/android-all/4.3_r2-robolectric-0/android-all-4.3_r2-robolectric-0.jar!/res...
        final EditText et=(EditText) findViewById(R.id.editText);//Debug.makeSymbolicRef("R.id.editText", new EditText(this));


        final SQLiteDatabase db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(stdno VARCHAR,name VARCHAR,marks VARCHAR);");

        db.execSQL("INSERT INTO student VALUES('9031066','ehsan','20');");
        db.execSQL("INSERT INTO student VALUES('9031068','hamid','19');");
        db.execSQL("INSERT INTO student VALUES('9031806','seyed','20');");
        final TextView tv = (TextView) findViewById(R.id.textview);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.execSQL("DELETE FROM student");
                Snackbar.make(view, "ALL Records Deleted!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String st =et.getText().toString();
                Cursor c=db.rawQuery("SELECT * FROM student where stdno='"+st+"'", null);
                String buffer=new String();
                while(c.moveToNext())
                {
                    buffer+="stdno: "+c.getString(0)+"\n";
                    buffer+="Name: "+c.getString(1)+"\n";
                    buffer+="Marks: "+c.getString(2)+"\n\n";
                }
                tv.setText(buffer);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}