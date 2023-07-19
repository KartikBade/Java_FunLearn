package com.example.javafunlearn.EndBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.javafunlearn.MidBonus.MainTransition;
import com.example.javafunlearn.MidBonus.MyService;
import com.example.javafunlearn.MidBonus.Question1;
import com.example.javafunlearn.R;

import java.util.Timer;
import java.util.TimerTask;

public class bonusTransition extends AppCompatActivity {

    int score=0;
    Timer timer;
    MyService connService;
    boolean isBound=false;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_transition);


        MediaPlayer mp = MediaPlayer.create(this,R.raw.bonus);
        mp.start();


        RunAnimation();
        activitySwitch();



    }

    public void activitySwitch() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(bonusTransition.this, endQuestion1.class);
                startActivity(intent);
            }
        }, 2500);
    }


    private void RunAnimation()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Animation b = AnimationUtils.loadAnimation(this, R.anim.bounce);
        a.reset();
        ImageView tv = (ImageView) findViewById(R.id.imageView);
        tv.clearAnimation();
        tv.startAnimation(b);
        tv.startAnimation(a);
        tv.setVisibility(View.INVISIBLE);

    }
}