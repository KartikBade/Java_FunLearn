package com.example.javafunlearn.MidBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.TextView;

import com.example.javafunlearn.Levels;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class BonusScore extends AppCompatActivity {


    Timer timer;
    MyService1 service1;
    MyService mySer;
    MyService connService;
    Boolean isBound= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_score);
        Intent oldService = new Intent(this, MyService.class);
        stopService(oldService);

        TextView tv = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();


        activitySwitch();
        Intent i = new Intent(this, MyService.class);
        stopService(i);

       /* int q1 = extras.getInt("Q1");
        int q2 = extras.getInt("Q2");
        int q3 = extras.getInt("Q3");
        int q4 = extras.getInt("Q4");
        int q5 = extras.getInt("Q5");
        int q6 = extras.getInt("Q6");
        int q7 = extras.getInt("Q7");
        int q8 = extras.getInt("Q8");
        int q9 = extras.getInt("Q9");
        int q10 = extras.getInt("Q10");
       int sum = q1+q2+q3+q4+q5+q6+q7+q8+q9+q10;

        String res = Integer.toString(sum);
        tv.setText(res);*/




    }




    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(BonusScore.this, Levels.class);
                startActivity(intent);
                try {

                    connService.onDestroy();
                    service1.resumeMusic();
                   // finish();
                }catch(Exception e)
                {

                }


            }
        }, 10);
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
}