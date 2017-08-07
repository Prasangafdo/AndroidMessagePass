package com.example.prasangafernando.activityswitch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView2);
        editText = (EditText) findViewById(R.id.editText);


        Intent intent= getIntent(); // gets the previously created intent
        String value = intent.getStringExtra("key");
        textView.setText(value);

    }


}
