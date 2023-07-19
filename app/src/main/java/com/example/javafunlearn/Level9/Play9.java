package com.example.javafunlearn.Level9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.javafunlearn.Level1.Play;
import com.example.javafunlearn.Level8.Play8;
import com.example.javafunlearn.Levels;
import com.example.javafunlearn.R;

public class  Play9 extends AppCompatActivity {

    Toast wrong;
    Toast correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play9);


        wrong = Toast.makeText(Play9.this, "Wrong!", Toast.LENGTH_SHORT);
        correct = Toast.makeText(Play9.this, "Correct!", Toast.LENGTH_SHORT);


        Button b1 = (Button) findViewById(R.id.q1o1);
        Button b2 = (Button) findViewById(R.id.q1o2);
        Button b3 = (Button) findViewById(R.id.q1o3);
        Button b4 = (Button) findViewById(R.id.q1o4);

        Button b5 = (Button) findViewById(R.id.q2o1);
        Button b6 = (Button) findViewById(R.id.q2o2);
        Button b7 = (Button) findViewById(R.id.q2o3);
        Button b8 = (Button) findViewById(R.id.q2o4);

        Button b9 = (Button) findViewById(R.id.q3o1);
        Button b10 = (Button) findViewById(R.id.q3o2);
        Button b11 = (Button) findViewById(R.id.q3o3);
        Button b12 = (Button) findViewById(R.id.q3o4);

        Button b13 = (Button) findViewById(R.id.q4o1);
        Button b14 = (Button) findViewById(R.id.q4o2);
        Button b15 = (Button) findViewById(R.id.q4o3);
        Button b16 = (Button) findViewById(R.id.q4o4);

        Button b17 = (Button) findViewById(R.id.q5o1);
        Button b18 = (Button) findViewById(R.id.q5o2);
        Button b19 = (Button) findViewById(R.id.q5o3);
        Button b20 = (Button) findViewById(R.id.q5o4);

        Button b21 = (Button) findViewById(R.id.q6o1);
        Button b22 = (Button) findViewById(R.id.q6o2);
        Button b23 = (Button) findViewById(R.id.q6o3);
        Button b24 = (Button) findViewById(R.id.q6o4);

        Button b25 = (Button) findViewById(R.id.q7o1);
        Button b26 = (Button) findViewById(R.id.q7o2);
        Button b27 = (Button) findViewById(R.id.q7o3);
        Button b28 = (Button) findViewById(R.id.q7o4);

        Button b29 = (Button) findViewById(R.id.q8o1);
        Button b30 = (Button) findViewById(R.id.q8o2);
        Button b31 = (Button) findViewById(R.id.q8o3);
        Button b32 = (Button) findViewById(R.id.q8o4);

        Button b33 = (Button) findViewById(R.id.q9o1);
        Button b34 = (Button) findViewById(R.id.q9o2);
        Button b35 = (Button) findViewById(R.id.q9o3);
        Button b36 = (Button) findViewById(R.id.q9o4);

        Button b37 = (Button) findViewById(R.id.q10o1);
        Button b38 = (Button) findViewById(R.id.q10o2);
        Button b39 = (Button) findViewById(R.id.q10o3);
        Button b40 = (Button) findViewById(R.id.q10o4);


        Button level_select = findViewById(R.id.button);
        //to level select
        level_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Play9.this, Levels.class);
                startActivity(i);
            }
        });



        //        Question 1

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setClickable(false);
                b1.setBackgroundColor(Color.RED);
                correct.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 2
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.RED);
                wrong.show();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setClickable(false);
                b7.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 3
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setClickable(false);
                b9.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b10.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b12.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 4
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setClickable(false);
                b13.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b14.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b15.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b16.setBackgroundColor(Color.RED);
                correct.show();
                b16.setClickable(false);
            }
        });


        //        Question 5
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b17.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b18.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b19.setClickable(false);
                b19.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b20.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 6
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b21.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b22.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b23.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b24.setClickable(false);
                b24.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });


        //        Question 7
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b25.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b26.setClickable(false);
                b26.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b27.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b28.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 8
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b29.setClickable(false);
                b29.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b30.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b31.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b32.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 9
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b33.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b34.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b35.setClickable(false);
                b35.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b36.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 10
        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b37.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b38.setClickable(false);
                b38.setBackgroundColor(Color.GREEN);
                correct.show();
            }
        });

        b39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b39.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b40.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });
    }
}
