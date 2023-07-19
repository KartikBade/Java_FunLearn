package com.example.javafunlearn.MidBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.javafunlearn.R;
import java.util.Timer;
import java.util.TimerTask;

public class Question5 extends Questions {
    int q5=1;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        RightWrong();
        activitySwitch();
    }



    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Question5.this, Question6.class);
                startActivity(intent);

            }
        }, 3000);
    }

    public  void RightWrong() {

        Button bt1 = findViewById(R.id.op1);
        Button bt2 = findViewById(R.id.op2);
        Button bt3 = findViewById(R.id.op3);
        Button bt4 = findViewById(R.id.op4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundColor(Color.RED);
                score = +1;
                Toast.makeText(Question5.this, "Wrong", Toast.LENGTH_SHORT).show();


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setBackgroundColor(Color.RED);
                Toast.makeText(Question5.this, "Wrong", Toast.LENGTH_SHORT).show();


            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundColor(Color.RED);
                Toast.makeText(Question5.this, "Wrong", Toast.LENGTH_SHORT).show();

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundColor(Color.GREEN);
                Toast.makeText(Question5.this, "Correct", Toast.LENGTH_SHORT).show();
                Intent inc = new Intent(getApplicationContext(), BonusScore.class);
                inc.putExtra("Q5", q5);

            }
        });
    }
}