package com.example.extstudent.assignment4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.Random;

//alt enter to import while highligngt

public class MainActivity extends AppCompatActivity {

    Button firstButton = null;
    private int buttonCount =0;
    LinearLayout scrollViewLayout= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollViewLayout = (LinearLayout) findViewById(R.id.scrollViewLayout);

        firstButton = (Button) findViewById(R.id.buttonSubmit);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNewButton();
                firstButton.setEnabled(false);
            }
        });


    }

    private void generateNewButton() {
        // TO-DO:
        // 1. Create a new Button widget (HINT: Pass in MainActivity.this);
        // 2. Create a layout prams for the new button. Layout params takes in the height and the width.
        // 3. Set the text and text color (use getRandomColor()) for the button. You can also set the background, but it might look weird.
        // 4. Create the callback for the new Button.
        // 5. Add the Button to the current view.
        //Button newButton = new Button (MainAcctivity.this);
        final Button newButton = new  Button(MainActivity.this);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        newButton.setLayoutParams(layoutParams);

        //newButton.setEnabled(FALSE);

        buttonCount++;
        newButton.setText("PRESS ME: " + Integer.toString(buttonCount));
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNewButton();
                newButton.setEnabled(false);
            }
            });
        //newButton.setTextColor();
        //newButton.setText("PRESS ME: " + Integer.toString(++buttonCount));
        scrollViewLayout.addView(newButton);

    }

    private int getRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    private int addOne(int number) {
        int finalValue = number +1;
        return finalValue;

    }

    private int AddONE(int number) {
        int finalValue = number +1;
        if(finalValue> 100) {
            return finalValue;
        }
        return AddONE(finalValue);
    }
}
