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



import com.example.javafunlearn.MidBonus.BonusScore;
import com.example.javafunlearn.*;

import com.example.javafunlearn.MidBonus.MyService;
import com.example.javafunlearn.MidBonus.Question1;
import com.example.javafunlearn.MidBonus.Question2;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class endQuestion1 extends AppCompatActivity {

    int q1=1;
    Timer timer;
    MyService connService;
    boolean isBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_question1);



        Intent i = new Intent(this, MyService.class);
        startService(i);
        bindService(i,conn, Context.BIND_AUTO_CREATE);

        RightWrong();

        activitySwitch();



    }

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.ServiceBinder binder = (MyService.ServiceBinder) service;
            connService =binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };


    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(endQuestion1.this, endQuestion2.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }


    public  void RightWrong(){

        Button bt1 = findViewById(R.id.op1);
        Button bt2 = findViewById(R.id.op2);
        Button bt3 = findViewById(R.id.op3);
        Button bt4 = findViewById(R.id.op4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setBackgroundColor(Color.RED);
                Toast.makeText(endQuestion1.this, "Wrong", Toast.LENGTH_SHORT).show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bt2.setBackgroundColor(Color.GREEN);

                Toast.makeText(endQuestion1.this, "Score Incremented", Toast.LENGTH_SHORT).show();

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundColor(Color.RED);
                Toast.makeText(endQuestion1.this, "Wrong", Toast.LENGTH_SHORT).show();

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundColor(Color.RED);
                Toast.makeText(endQuestion1.this, "Wrong", Toast.LENGTH_SHORT).show();

            }
        });
    }
}