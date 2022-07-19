package com.example.javafunlearn.MidBonus;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javafunlearn.Level1.Score1;
import com.example.javafunlearn.R;
import com.example.javafunlearn.*;
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

import java.util.Timer;
import java.util.TimerTask;

public class Question1 extends Questions {
   // MainActivity ma = new MainActivity();
    int q1=1;
    Timer timer;
   MyService connService;
    boolean isBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);




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
                Intent intent = new Intent(Question1.this, Question2.class);
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

                Toast.makeText(Question1.this, "Wrong!", Toast.LENGTH_SHORT).show();


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setBackgroundColor(Color.RED);
                Toast.makeText(Question1.this, "Wrong!", Toast.LENGTH_SHORT).show();


            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundColor(Color.RED);
                Toast.makeText(Question1.this, "Wrong!", Toast.LENGTH_SHORT).show();


            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundColor(Color.GREEN);
                Toast.makeText(Question1.this, "Correct!", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                bundle.putInt("Q1", q1);
                Intent inc = new Intent(Question1.this, BonusScore.class);
                inc.putExtras(bundle);

            }
        });
    }
}