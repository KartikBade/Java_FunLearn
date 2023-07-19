package com.example.javafunlearn.Learn.Learn1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn1 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn1);


        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());
        learn.setText(Html.fromHtml("<span> <p style =\"font-size:22sp\"><b>Data Types in Java:</b> </p> </span>\n" +
                "Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java: <br></br>\n" +
                "1. Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.<br></br>\n" +
                "2. Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.<br></br> <br></br>\n" +
                "     <span>  <p style =\"font-size:22sp\"> <b>Java Primitive Data Types: </b></p></span> \n" +
                "In Java language, primitive data types are the building blocks of data manipulation. These are the most basic data types available in Java language.\n" +
                "        <span><p><b>There are 8 types of primitive data types:</b></p></span>\n" +
                "<span><ol>\n" +
                "\n" +
                "  <li>boolean data type</li>\n" +
                "  <li>byte data type</li>\n" +
                "  <li>char data type</li>\n" +
                "  <li>short data type</li>\n" +
                "  <li>int data type</li>\n" +
                "  <li>long data type</li>\n" +
                "  <li>float data type</li>\n" +
                "  <li>double data type</li>\n" +
                "\n" +
                "</ol><br>" +
                "<span> <p style =\"font-size:18sp\"><b> Boolean Data Type:</b> </span> The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions. </p> \n"

                +"<span> <p style =\"font-size:18sp\"><b> Byte Data Type:</b> </span> The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0. \n  </p> \n"

                +"<span> <p style =\"font-size:18sp\"><b> Short Data Type:</b> </span> The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.</p> \n" +"The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.\n"

                + "<span> <p style =\"font-size:18sp\"><b> Int Data Type:</b> </span> The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.</p> \n" +"The int data type is generally used as a default data type for integral values unless if there is no problem about memory.\n"

                +"<span> <p style =\"font-size:18sp\"><b> Long Data Type:</b> </span> The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807." +" \n Its default value is 0. The long data type is used when you need a range of values more than those provided by int.\n"

                +"<span> <p style =\"font-size:18sp\"><b> Float Data Type:</b> </span> The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. " +"\n The float data type should never be used for precise values, such as currency. Its default value is 0.0F.\n"

                        +"<span> <p style =\"font-size:18sp\"><b> Double Data Type:</b> </span> The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float.  \n" +"The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.\n"

                        +"<span> <p style =\"font-size:18sp\"><b> Char Data Type:</b> </span> The char data type is a single 16-bit Unicode character. Its value-range lies between '\\u0000' (or 0) to '\\uffff' (or 65,535 inclusive).The char data type is used to store characters.\n"
                , Html.FROM_HTML_MODE_COMPACT));
                //+"<p> Here is a link to a video explaining more</p> \n" + "<a href=\"https://www.youtube.com/watch?v=iFzA43xR04s\">Click Here to View The Video</a>"



    }


}