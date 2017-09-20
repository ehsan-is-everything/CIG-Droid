package com.example.lab.testak_textinput;

//import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import gov.nasa.jpf.symbc.Debug;
import android.os.Bundle;
//import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Debug.printSymbolicRef(getIntent(), "PRINT OF INTENT IN SECONDACTIVITY!!!:::>>>");
        int id = getIntent().getIntExtra("ID",0);
        Debug.printSymbolicRef(id, "PRINT OF ID IN SECONDACTIVITY!!!:::>>>");
        if(id==125) {
        	Debug.printPC("PC IN IF IN SECOND ACTIVITY!!!!!!:::::>>>>>");
            assert (false);
        }
    }
}
