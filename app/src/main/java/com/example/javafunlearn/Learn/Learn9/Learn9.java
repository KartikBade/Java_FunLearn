package com.example.javafunlearn.Learn.Learn9;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.javafunlearn.Level1.Play;
import com.example.javafunlearn.Levels;
import com.example.javafunlearn.R;

public class Learn9 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn9);

        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml("<b> Exception Handling in Java : </b>"
                +
                "<p> The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained. <br> Dictionary Meaning: Exception is an abnormal condition. <br> In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime. </p>"
                +
                "<b>What is Exception Handling? </b>"
                +
                "<p>In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.</p>"
                +
                "<b>Advantage of Exception Handling:</b>"
                +
                "<p>The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application that is why we use exception handling. Let's take a scenario: <br> </p>"+
                "statement 1;  \n<br>"  +
                        "statement 2; <br> \n" +
                        "statement 3; <br> \n" +
                        "statement 4;  <br>\n" +
                        "statement 5;//exception occurs <br> \n" +
                        "statement 6; <br> \n"+
                        "statement 7; <br><br>"
                +
                "<p> Suppose there are 6 statements in your program and there occurs an exception at statement 5, the rest of the code will not be executed i.e. statement 6 to statement 7 will not be executed. If we perform exception handling, the rest of the statement will be executed. That is why we use exception handling in Java. </p> <br> "
                +
                "<b>Types of Java Exceptions: <br> </b>"
                +
                "<p> There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions: <br> </p>"
                +
                "<ol>\n" +
                        "<li><b>Checked Exception : </b> The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.</li> <br>\n" +

                        "<li><b>Unchecked Exception : </b> The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.</li> <br>\n" +

                        "<li><b>Error : </b> Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.\n" +
                        "\n</li> <br> \n" +
                        "</ol> <br>"
+
                "<b>Java Exception Keywords: </b> <br>"
                        +
                "<p><b>There are 5 keywords which are used in handling exceptions in Java.: </b></p>\n" +
                        "<ol>\n" +
                        "<li><b>try :  </b>  The \"try\" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.</li> <br>\n" +
                        "\n" +
                        "<li><b>catch : </b> The \"catch\" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.</li><br>\n" +
                        "\n" +
                        "<li><b>finally : </b> The \"finally\" block is used to execute the important code of the program. It is executed whether an exception is handled or not.</li><br>\n" +
                        "\n" +
                        "<li><b>throw: </b>The \"throw\" keyword is used to throw an exception.</li><br>\n" +
                        "\n" +
                        "<li><b>throws: </b> The \"throws\" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.</li><br>\n" +
                        "\n" +
                        "</ol><br>"
                +
                "<b> </b>"




                , Html.FROM_HTML_MODE_COMPACT));


    }
}