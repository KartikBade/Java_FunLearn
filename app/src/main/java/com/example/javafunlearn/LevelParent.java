package com.example.javafunlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.javafunlearn.Level1.Play;

public class LevelParent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_parent);

        int score=0;
        Intent intentParent = new Intent(LevelParent.this, Play.class);
        intentParent.putExtra("Score",score);
    }
}