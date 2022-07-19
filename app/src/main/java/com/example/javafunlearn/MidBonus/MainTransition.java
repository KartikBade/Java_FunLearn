package com.example.javafunlearn.MidBonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.javafunlearn.MainActivity;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.R;
import com.example.javafunlearn.MidBonus.MyService;
import java.util.Timer;
import java.util.TimerTask;

public class MainTransition extends AppCompatActivity   {

    int score=0;
    Timer timer;
    MyService1 connService;
    MyService1 ser;
    boolean isBound=false;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_transition);






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

                Intent intent = new Intent(MainTransition.this, Question1.class);
                startActivity(intent);
            }
        }, 4000);
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
