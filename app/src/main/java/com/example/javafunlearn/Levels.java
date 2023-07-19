package com.example.javafunlearn;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javafunlearn.EndBonus.bonusTransition;
import com.example.javafunlearn.MidBonus.MyService;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.MidBonus.MyService;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import com.example.javafunlearn.Level1.Play;
import com.example.javafunlearn.Level2.Play2;
import com.example.javafunlearn.Level3.Play3;
import com.example.javafunlearn.Level4.Play4;
import com.example.javafunlearn.Level5.Play5;
import com.example.javafunlearn.Level6.Play6;
import com.example.javafunlearn.Level7.Play7;
import com.example.javafunlearn.Level8.Play8;
import com.example.javafunlearn.Level9.Play9;
import com.example.javafunlearn.MidBonus.MainTransition;

public class Levels extends AppCompatActivity {

    MyService1 service1;
    MyService myser;

    MyService1 connService;
    boolean isBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);


        Intent i = new Intent(this, MyService1.class);
        startService(i);
        bindService(i,conn, Context.BIND_AUTO_CREATE);





        TextView toHome = findViewById(R.id.toHome);

        TextView level_1_button = (TextView) findViewById(R.id.level_1);
        TextView level_2_button = (TextView) findViewById(R.id.level_2);
        TextView level_3_button = (TextView) findViewById(R.id.level_3);
        TextView level_4_button = (TextView) findViewById(R.id.level_4);
        TextView level_5_button = (TextView) findViewById(R.id.level_5);
        TextView level_6_button = (TextView) findViewById(R.id.level_6);
        TextView level_7_button = (TextView) findViewById(R.id.level_7);
        TextView level_8_button = (TextView) findViewById(R.id.level_8);
        TextView level_9_button = (TextView) findViewById(R.id.level_9);


        TextView midBonus = (TextView) findViewById(R.id.midBonus);
        TextView endBonus = (TextView) findViewById(R.id.level_10);





        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Levels.this,MainActivity.class);
                startActivity(intent);
            }
        });


        level_1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play.class);
                startActivity(playIntent);

            }
        });

        level_2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play2.class);
                startActivity(playIntent);

            }
        });

        level_3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play3.class);
                startActivity(playIntent);

            }
        });

        level_4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play4.class);
                startActivity(playIntent);

            }
        });

        level_5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play5.class);
                startActivity(playIntent);

            }
        });

        midBonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(Levels.this, MainTransition.class);
                startActivity(playIntent);

                connService.pauseMusic();

            }
        });

        level_6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play6.class);
                startActivity(playIntent);

            }
        });

        level_7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play7.class);
                startActivity(playIntent);

            }
        });

        level_8_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play8.class);
                startActivity(playIntent);

            }
        });

        level_9_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(Levels.this, Play9.class);
                startActivity(playIntent);

            }
        });


        endBonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(Levels.this, bonusTransition.class);
                startActivity(playIntent);
                connService.pauseMusic();
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