package com.example.javafunlearn.Level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.javafunlearn.Levels;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class Score1 extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score1);


        TextView tv = findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        int str = extras.getInt("Score");

        String scr = Integer.toString(str);

        tv.setText(scr);


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Levels.class);
                intent.putExtra("Scr", str);

                startActivity(intent);

            }
        }, 3000);


    }


    public void activitySwitch() {

    }
}