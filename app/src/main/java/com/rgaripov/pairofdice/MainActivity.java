package com.rgaripov.pairofdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        final int numberOfDots = 6;
        final int [] leftDiceArray = {
                R.drawable.dice1black,
                R.drawable.dice2black,
                R.drawable.dice3black,
                R.drawable.dice4black,
                R.drawable.dice5black,
                R.drawable.dice6black
        };
        final int [] rightDiceArray ={
                R.drawable.dice1red,
                R.drawable.dice2red,
                R.drawable.dice3red,
                R.drawable.dice4red,
                R.drawable.dice5red,
                R.drawable.dice6red
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice", "Button works!");

                Random randomNumberGenerator = new Random();
                int number1 = randomNumberGenerator.nextInt(numberOfDots);
                int number2 = randomNumberGenerator.nextInt(numberOfDots);

                Log.d("Dice", "number1 is " + number1 + ", number2 is " + number2);

                leftDice.setImageResource(leftDiceArray[number1]);
                rightDice.setImageResource(rightDiceArray[number2]);

            }
        });

    }
}
