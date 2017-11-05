package com.example.lab.testak_textinput;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int counter = 1;
        String s="";
        while(counter-1<getIntent().getIntExtra("count",0)) {
            s+=getIntent().getStringExtra("name"+counter)+"\n";
            s+=getIntent().getStringExtra("stdno"+counter)+"\n";
            s+=getIntent().getStringExtra("marks"+counter)+"\n";
            counter++;
        }
        ((TextView)findViewById(R.id.textView2)).setText(s);
    }
}
