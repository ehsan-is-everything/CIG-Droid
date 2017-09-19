package com.example.lab.testak_textinput;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int id = getIntent().getIntExtra("ID",0);
        if(id==125) {
            Log.e("TEST","ERROR FOUND!!!");
            assert (false);
        }
    }
}
