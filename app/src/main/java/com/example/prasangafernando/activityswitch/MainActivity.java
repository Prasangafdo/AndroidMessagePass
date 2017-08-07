package com.example.prasangafernando.activityswitch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    ///////////////////////////////////////////////////////
    /////This code includes the visibility button too/////
    /////////////////////////////////////////////////////

    //Developer -- Prasanga Fernando
Button button;
    Button button2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setVisibility(View.GONE);

        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                   intent.putExtra("key", editText.getText().toString());
               startActivity(intent);

               }
        });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        button.setVisibility(View.VISIBLE);
                    }
         });



    }


}
