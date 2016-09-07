package com.amarjot8.parttwo;
//http://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
//http://stackoverflow.com/questions/4761686/how-to-set-background-color-of-an-activity-to-white-programmatically
//http://stackoverflow.com/questions/7873480/android-one-onclick-method-for-multiple-buttons
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
    //Buttons that are used in multiple methods
    protected Button RedB;
    protected Button BlueB;
    protected Button GreenB;
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
        RedB = ((Button) findViewById(R.id.redButton));
        BlueB = ((Button) findViewById(R.id.blueButton));
        GreenB = ((Button) findViewById(R.id.greenButton));

        //When button is clicked
        ToastB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting input from TextField/EditText
                String s = ((EditText) findViewById(R.id.edit_message)).getText().toString();
                //Making this toast apear on screen
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
            }
        });

        ((EditText) findViewById(R.id.edit_message)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //When text is in field
                if(s.toString().isEmpty())
                {
                    //SetActive
                    Log.e("s", "Enable");
                    ToastB.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Disable button when editfield is empty
                if(s.toString().isEmpty())
                {
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

        //Depending on what button was pressed
        switch(v.getId())
        {
            //If Blue pressed, Change background color, Disable it, enable others
            case R.id.blueButton:
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                BlueB.setEnabled(false);
                GreenB.setEnabled(true);
                RedB.setEnabled(true);
                break;

            case R.id.greenButton:
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                GreenB.setEnabled(false);
                BlueB.setEnabled(true);
                RedB.setEnabled(true);
                break;

            case R.id.redButton:
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                RedB.setEnabled(false);
                GreenB.setEnabled(true);
                BlueB.setEnabled(true);
                break;
        }
    }
}
