package com.example.javafunlearn.MidBonus;

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

public class Question10 extends Questions {
    int q10=1;
    Timer timer;
    MyService1 service1;
    MyService mySer;
    MyService connService;
    Boolean isBound = false;
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        RightWrong();
        activitySwitch();
        connService = new MyService();

    }



    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Question10.this, BonusScore.class);
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

                Toast.makeText(Question10.this, "Wrong", Toast.LENGTH_SHORT).show();


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setBackgroundColor(Color.RED);
                Toast.makeText(Question10.this, "Wrong", Toast.LENGTH_SHORT).show();


            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setBackgroundColor(Color.GREEN);
                Toast.makeText(Question10.this, "Correct", Toast.LENGTH_SHORT).show();
                Intent inc = new Intent(getApplicationContext(), BonusScore.class);
                inc.putExtra("Q10", q10);

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setBackgroundColor(Color.RED);
                Toast.makeText(Question10.this, "Wrong", Toast.LENGTH_SHORT).show();


            }
        });
    }


    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.ServiceBinder binder = (MyService.ServiceBinder) service;
            connService = binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };




   /*private ServiceConnection myServe1 = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService1.ServiceBinder binder = (MyService1.ServiceBinder) service;
            service1 = binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };/*/



}