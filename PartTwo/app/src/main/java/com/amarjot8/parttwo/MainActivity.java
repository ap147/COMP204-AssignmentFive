package com.amarjot8.parttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This message will apear when application starts
        Log.e("Our Tag", "Our Application is Starting..");
        setContentView(R.layout.activity_main);

        //Creating Toast Button
        final Button b =((Button) findViewById(R.id.button));
        //When button is clicked
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting input from TextField/EditText
                String s = ((EditText) findViewById(R.id.edit_message)).getText().toString();//((EditText)findViewById(R.id.edit_message));
                //Making this toast apear on screen
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
            }
        });

        ((EditText) findViewById(R.id.edit_message)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().isEmpty())
                {
                    //SetActive
                    Log.e("s", "Enable");
                    b.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().isEmpty())
                {
                    //Disable
                    Log.e("s", "Disable");
                    b.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}