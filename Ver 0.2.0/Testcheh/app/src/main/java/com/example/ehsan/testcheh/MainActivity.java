package com.example.ehsan.testcheh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ehsan");
        Button b= (Button) findViewById(R.id.button_submit);
        EditText et= (EditText) findViewById(R.id.edit_text);
        final String etStr = et.getText().toString();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTitle(etStr);
                assert(false);
            }
        });
    }
}
