package com.amarjot8.parttwo;
//http://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
//http://stackoverflow.com/questions/4761686/how-to-set-background-color-of-an-activity-to-white-programmatically
import android.graphics.Color;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This message will apear when application starts
        Log.e("Our Tag", "Our Application is Starting..");
        setContentView(R.layout.activity_main);

        //Creating Toast Button
        final Button ToastB =((Button) findViewById(R.id.button));
        //Disabling the button since app just started, there will be no input in EditField
        Log.e("s", "Disable");
        ToastB.setEnabled(false);
        //Creating the additional three buttons
        Button RedB = ((Button) findViewById(R.id.redButton));
        Button BlueB = ((Button) findViewById(R.id.blueButton));
        Button GreenB = ((Button) findViewById(R.id.greenButton));

        //When button is clicked
        ToastB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting input from TextField/EditText
                String s = ((EditText) findViewById(R.id.edit_message)).getText().toString();//((EditText)findViewById(R.id.edit_message));
                //Making this toast apear on screen
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
            }
        });


        RedB.setOnClickListener(this);
        GreenB.setOnClickListener(this);
        BlueB.setOnClickListener(this);

        ((EditText) findViewById(R.id.edit_message)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().isEmpty())
                {
                    //SetActive
                    Log.e("s", "Enable");
                    ToastB.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().isEmpty())
                {
                    //Disable
                    Log.e("s", "Disable");
                    ToastB.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    @Override
    public void onClick(View v) {

        getWindow().getDecorView().setBackgroundColor(Color.RED);
        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        
        //Getting input from TextField/EditText
        String s = ((EditText) findViewById(R.id.edit_message)).getText().toString();//((EditText)findViewById(R.id.edit_message));
        //Making this toast apear on screen
        Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
    }
}
