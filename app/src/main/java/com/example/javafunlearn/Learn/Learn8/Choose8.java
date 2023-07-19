package com.example.javafunlearn.Learn.Learn8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.javafunlearn.Learn.Learn7.Choose7;
import com.example.javafunlearn.Learn.Learn7.Learn7;
import com.example.javafunlearn.Learn.LearnLevels;
import com.example.javafunlearn.MyService1;
import com.example.javafunlearn.R;

public class Choose8 extends AppCompatActivity {
MyService1 ms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose8);


        Button read = findViewById(R.id.Read);
        Button video = findViewById(R.id.videoLink);
        Button toHome = findViewById(R.id.toHome);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(Choose8.this, Learn8.class);
                startActivity(playIntent);
            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ak_FjM_cbbk"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Choose8.this, LearnLevels.class);
                startActivity(i);
                try {

                    ms.resumeMusic();
                    //finish();

                }catch(Exception e)
                {

                }



            }
        });
    }
}