package com.example.javafunlearn.EndBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.MidBonus.MyService;
import com.example.javafunlearn.Levels;
import com.example.javafunlearn.R;
import java.util.Timer;
import java.util.TimerTask;

public class endQuestion10 extends AppCompatActivity {
    int q10=1;
    Timer timer;
    MyService1 service1;
    MyService mySer;
    MyService connService;
    Boolean isBound = false;
    Toast wrong,correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_question10);
        RightWrong();
        activitySwitch();
        connService = new MyService();

    }



    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(endQuestion10.this, end.class);
                startActivity(intent);


            }
        }, 2500);
    }

    public  void RightWrong() {

        Button bt1 = findViewById(R.id.op1);
        Button bt2 = findViewById(R.id.op2);
        Button bt3 = findViewById(R.id.op3);
        Button bt4 = findViewById(R.id.op4);
        wrong = Toast.makeText(endQuestion10.this, "Wrong!", Toast.LENGTH_SHORT);
        correct = Toast.makeText(endQuestion10.this, "Correct!", Toast.LENGTH_SHORT);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bt1.setBackgroundColor(Color.RED);
                wrong.show();
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

                bt3.setBackgroundColor(Color.GREEN);
                correct.show();

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