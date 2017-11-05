package com.example.lab.testak_textinput;

import android.content.Context;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText et=(EditText) findViewById(R.id.editText);

        final EditText et_del= (EditText) findViewById(R.id.editText_del);

        final SQLiteDatabase db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(stdno VARCHAR,name VARCHAR,marks VARCHAR);");

        db.execSQL("INSERT INTO student VALUES('9031066','ehsan','20');");
        db.execSQL("INSERT INTO student VALUES('9031068','hamid','19');");
        db.execSQL("INSERT INTO student VALUES('9031806','seyed','20');");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "your record with name="+et_del.getText().toString()+" deleted!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                int a=db.delete("student","name=?",new String[]{et_del.getText().toString()});
                if(a==0)
                    Snackbar.make(view, "your record with name="+et_del.getText().toString()+"cant be deleted!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                else
                    Snackbar.make(view, "your record with name="+et_del.getText().toString()+" deleted!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
            }
        });

        Button b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Cursor c= db.query(false,"student",null,"stdno='"+et.getText().toString()+"'",null,null,null,null,null);
                    Intent myIntent = new Intent(MainActivity.this,
                            SecondActivity.class);
                int counter=1;
                myIntent.putExtra("count", c.getCount());
                while(c.moveToNext()) {
                    myIntent.putExtra("name"+counter, c.getString(1));
                    myIntent.putExtra("stdno"+counter, c.getString(0));
                    myIntent.putExtra("marks"+counter, c.getString(2));
                    counter++;
                }
                    startActivity(myIntent);

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
