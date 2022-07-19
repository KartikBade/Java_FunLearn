package com.example.javafunlearn.EndBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.javafunlearn.MidBonus.BonusScore;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class endQuestion8 extends AppCompatActivity {

    Timer timer;
    Toast wrong,correct;
    int q2=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_question8);

        RightWrong();
        activitySwitch();

    }


    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(endQuestion8.this, endQuestion9.class);
                startActivity(intent);

            }
        }, 2500);
    }


    public  void RightWrong(){

        Button bt1 = findViewById(R.id.op1);
        Button bt2 = findViewById(R.id.op2);
        Button bt3 = findViewById(R.id.op3);
        Button bt4 = findViewById(R.id.op4);
        wrong = Toast.makeText(endQuestion8.this, "Wrong!", Toast.LENGTH_SHORT);
        correct = Toast.makeText(endQuestion8.this, "Correct!", Toast.LENGTH_SHORT);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundColor(Color.GREEN);

                correct.show();


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setBackgroundColor(Color.RED);
                wrong.show();

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundColor(Color.RED);
                wrong.show();

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });
    }
}