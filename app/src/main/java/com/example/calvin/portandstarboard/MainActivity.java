package com.example.calvin.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myApp";
    private Game PortStarboardGame = new Game();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wire up left button to log and make toast
        //...get the button
        Button leftbtn = (Button) findViewById(R.id.leftNameBtn);
        //...set up the button to toast when user clicks
        leftbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Port(left) is Red", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Port(left) is Red");
            }
        });

        Button rightbtn = (Button) findViewById(R.id.rightNameBtn);
        //...set up the button to toast when user clicks
        rightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Port(right) is Green", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Port(right) is Green");
            }
        });

        Button leftAnswer = (Button) findViewById(R.id.leftAnsBtn);
        //user clicks one to indicate the game's currently chosen side
        leftAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if user is correct
                    //make a Toast message "Correct!"
                    //Log message "User guess of Port was Correct!"
                //else
                    //display Toast message "Incorrect! :("
                    //Log message "User guess of Port was Incorrect!"
                //set random
            }
        });

        Button rightAnswer = (Button) findViewById(R.id.rightAnsBtn);
        rightAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if user is correct
                    //make a Toast message "Correct!"
                    //Log message "User guess of Starboard was Correct!"
                //else
                    //display Toast message "Incorrect! :("
                    //Log message "User guess of Starboard was Incorrect!"
                //set random
            }
        });
    }}