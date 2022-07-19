package com.example.javafunlearn;

import androidx.appcompat.app.AppCompatActivity;
import  com.example.javafunlearn.MyService1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
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

        TextView quitButton = ((TextView) findViewById(R.id.quit_button));

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent levelsIntent = new Intent(MainActivity.this, Levels.class);
                startActivity(levelsIntent);
            }
        });



        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

                System.exit(0);
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