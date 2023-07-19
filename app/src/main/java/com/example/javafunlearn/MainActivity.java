package com.example.javafunlearn;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javafunlearn.Learn.LearnLevels;
import  com.example.javafunlearn.MyService1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyService1 connService;
    boolean isBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//BED5C7
        Intent i = new Intent(this, MyService1.class);
        startService(i);
        bindService(i, conn, Context.BIND_AUTO_CREATE);

        TextView playButton = (TextView) findViewById(R.id.play_button);
        TextView learnButton =(TextView) findViewById(R.id.learn_button);
        TextView quitButton = ((TextView) findViewById(R.id.quit_button));

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent levelsIntent = new Intent(MainActivity.this, Levels.class);
                startActivity(levelsIntent);
            }
        });


        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent levelsIntent = new Intent(MainActivity.this, LearnLevels.class);
                startActivity(levelsIntent);
            }
        });



        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finishAffinity();
            }
        });
    }

       private ServiceConnection conn = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                MyService1.ServiceBinder binder = (MyService1.ServiceBinder) service;
                connService = binder.getService();
                isBound=true;
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                isBound = false;
            }
        };


}