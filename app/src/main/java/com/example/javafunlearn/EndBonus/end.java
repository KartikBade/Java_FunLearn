package com.example.javafunlearn.EndBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.TextView;

import com.example.javafunlearn.Levels;
import com.example.javafunlearn.MidBonus.BonusScore;
import com.example.javafunlearn.MidBonus.MyService;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class end extends AppCompatActivity {

    Timer timer;
    MyService1 service1;
    MyService mySer;
    MyService connService;
    Boolean isBound= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent oldService = new Intent(this, MyService.class);
        stopService(oldService);

        TextView tv = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();


        activitySwitch();
        Intent i = new Intent(this, MyService.class);
        stopService(i);

    }
        public void activitySwitch() {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent = new Intent(end.this, Levels.class);
                    startActivity(intent);
                    try {

                        connService.onDestroy();
                        service1.resumeMusic();
                        //finish();
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