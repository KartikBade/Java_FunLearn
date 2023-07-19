package com.example.javafunlearn.Learn.Learn2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn2 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2);

        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());
      learn.setText(Html.fromHtml("<p style =\"font-size:24px\"><span> <b>Operators in Java:</b>  </span> </p>\n" +"\n<br>"+
              "<p><span><b>Operator in Java</b></span> is a symbol which is used to perform operations. For example:  +, -, *, / etc.</p>\n" +
              "\n<br>" +
              "<p>There are many types of operators in Java which are given below:</p>\n" +
              "<ol>\n" +
              "<li>Unary Operator,</li>\n" +
              "<li>Arithmetic Operator,</li>\n" +
              "<li>Shift Operator,</li>\n" +
              "<li>Relational Operator,</li>\n" +
              "<li>Bitwise Operator,</li>\n" +
              "<li>Logical Operator,</li>\n" +
              "<li>Ternary Operator and</li>\n" +
              "<li>Assignment Operator.</li>\n" +
              "</ol>"+"\n <br>"+

              "<p><span><b>Unary Operator</b></span>:   The Java <span><b>unary operators: </b></span> require only one operand Example: expr++, expr--.  ++expr,--expr ,etc.  Unary operators are used to perform various operations i.e.: </p>\n"+
              "<ol>" +
              "<li>incrementing/decrementing a value by one</li>\n" +
              "<li>negating an expression</li>\n" +
             "<li>inverting the value of a boolean</li>\n" +
             "</ol>"+

              "<p><span><b>Java Arithmetic Operators : </b></span>  Java <span><b>arithmatic operators </b></span> are used to perform addition, subtraction, multiplication, and division. They act as basic mathematical operations. \n\n Example:+,-*,/,%,etc. </p>"+

              "<p><span><b>Java Left Shift Operator: </b></span> The Java <span><b>left shift operator  << </b> </span> is used to shift all of the bits in a value to the left side of a specified number of times.</p>"+

              "<p><span><b>Java Right Shift Operator</b></span>The Java <span> <b>right shift operator \">>\" </b> </span>  is used to move left operands value to right by the number of bits specified by the right operand.</p>"+

              "<p><span><b>Java Relational Operators: </b></span>The Java <span> <b>relation operators </b> </span> These are a bunch of binary operators that are used to check for relations between two operands including equality, greater than, less than etc.</p>"+

             "<p><span><b>Java AND Operator : Logical && and Bitwise &  : </b> </span>The Java <span> <b> logical && operator </b> </span>  doesn't check second condition if first condition is false. It checks second condition only if first one is true. <br> The <span> <b>bitwise & operator</b> </span> always checks both conditions whether first condition is true or false.</p>"+

              "<p><span><b>Java Ternary Operator : </b> </span>The Java <span> <b> Ternary operator </b> </span> is used as one liner replacement for if-then-else statement and used a lot in Java programming. it is the only conditional operator which takes three operands. Example : ?,: </p>"+

              "<p><span><b>Java Assignment Operator : </b> </span>The Java <span> <b> assignment operator </b> </span> is one of the most common operator. It is used to assign the value on its right to the operand on its left. Example : =, +=, -=, *=, /=, %= ,etc. </p>\""

              ,Html.FROM_HTML_MODE_COMPACT));
    }
}