package com.example.javafunlearn.Level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.javafunlearn.LevelParent;
import com.example.javafunlearn.Levels;
import com.example.javafunlearn.R;

public class Play extends AppCompatActivity {


    Toast wrong;
    Toast correct;
    int score=0;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Score ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);



        wrong = Toast.makeText(Play.this, "Wrong!", Toast.LENGTH_SHORT);
        correct = Toast.makeText(Play.this, "Correct!", Toast.LENGTH_SHORT);



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
                Intent i = new Intent(Play.this, Levels.class);
                startActivity(i);
            }
        });


        //        Question 1

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setClickable(false);
                b2.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;

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
                b7.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setClickable(false);
                b8.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
            }
        });


        //        Question 3
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setBackgroundColor(Color.RED);
                wrong.show();
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
                b12.setClickable(false);
                b12.setBackgroundColor( Color.GREEN);
                correct.show();
                score+=1;
            }
        });


        //        Question 4
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setBackgroundColor(Color.RED);
                wrong.show();
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
                b15.setClickable(false);
            b15.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b16.setBackgroundColor(Color.RED);
                wrong.show();
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
                b18.setClickable(false);
                b18.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b19.setBackgroundColor(Color.RED);
                wrong.show();
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
                b21.setClickable(false);
                b21.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;


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
                b24.setBackgroundColor(Color.RED);
                wrong.show();
            }
        });


        //        Question 7
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b25.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
            }
        });

        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b26.setBackgroundColor(Color.RED);
                wrong.show();
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
                b29.setBackgroundColor(Color.RED);
                wrong.show();
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
                b31.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
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
                b35.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
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
                b37.setBackgroundColor(Color.GREEN);
                correct.show();
                score+=1;
               /* Intent inc = new Intent(getApplicationContext(),Score1.class);
                inc.putExtra("Score", score);
                startActivity(inc);*/

            }
        });

        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b38.setBackgroundColor(Color.RED);
                wrong.show();
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




            //SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
            //String scr = Integer.toString(score);
           // SharedPreferences.Editor editor = sharedpreferences.edit();
           // editor.putString(Score,scr);


    }




}