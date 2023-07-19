package com.example.javafunlearn.Learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import com.example.javafunlearn.Learn.Learn1.Choose1;
import com.example.javafunlearn.Learn.Learn1.Learn1;
import com.example.javafunlearn.Learn.Learn10.Choose10;
import com.example.javafunlearn.Learn.Learn2.Choose2;
import com.example.javafunlearn.Learn.Learn3.Choose3;
import com.example.javafunlearn.Learn.Learn4.Choose4;
import com.example.javafunlearn.Learn.Learn5.Choose5;
import com.example.javafunlearn.Learn.Learn6.Choose6;
import com.example.javafunlearn.Learn.Learn7.Choose7;
import com.example.javafunlearn.Learn.Learn8.Choose8;
import com.example.javafunlearn.Learn.Learn9.Choose9;
import com.example.javafunlearn.Level2.Play2;
import com.example.javafunlearn.Levels;
import com.example.javafunlearn.MainActivity;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.R;

public class LearnLevels extends AppCompatActivity {
MyService1 ms;
    MyService1 connService;
    boolean isBound=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_levels);


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
        TextView level_10_button = (TextView) findViewById(R.id.resources);


        level_1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose1.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });

        level_2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose2.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });


        level_3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose3.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });

        level_4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose4.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });


        level_5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose5.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });

        level_6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose6.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });

        level_7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose7.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });



        level_8_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose8.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });


        level_9_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose9.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });


        level_10_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(LearnLevels.this, Choose10.class);
                startActivity(playIntent);
                connService.pauseMusic();

            }
        });



        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(LearnLevels.this, MainActivity.class);
                startActivity(playIntent);
                finish();
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