package com.example.javafunlearn.Learn.Learn3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn3 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn3);

        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml("\n" +
                "<p><span style= \"font-size: 24sp;\"><b> Control Statements in Java :</b></span></h3> </p> <br>" +

                "<p>  Java compiler executes the java code from top to bottom. The statements are executed according to the order in which they appear. However, Java provides statements that can be used to control the flow of java code. Such statements are called control flow statements. </p> <br>" +

                "<p>Java provides three types of control flow statements.</p>\n" +
                        "<ol>\n" +
                        "<li>Decision Making statements</li>\n" +
                        "<li>Loop statements</li>\n" +
                        "<li>Jump statements</li>\n" +
                        "</ol> <br>"+

                "<p><span> <b> 1. Decision Making Statements: </b> </span></p>\n"+
                "<p> Decision-making statements evaluate the Boolean expression and control the program flow depending upon the condition result. There are two types of decision-making statements in java, I.e., If statement and switch statement. </p>" +
                "<p><span><b> i) If Statement: </b></span> \n"+
                "<p>In Java, the \"if\" statement is used to evaluate a condition. The control of the program is diverted depending upon the condition result that is a Boolean value, either true or false. In java, there are four types of if-statements given below.</p>"+

                "<ol type= \"1\">\n" +
                        "<li><b>If statement:</b> This is the most basic statement among all control flow statements in java. It evaluates a Boolean expression and enables the program to enter a block of code if the expression evaluates to true. <br> <b>Syntax: </b><br> if(<condition>) { <br>  \n" +
                        "//block of code <br> \n" +
                        "} <br> <br> </li>\n" +

                        "<li><b> if - else statement: </b> The if-else statement is an extension to the if-statement, which uses another block of code, I.e., else block. The else block is executed if the condition of the if-block is evaluated as false. <br> <b>Syntax: </b> <br> if(condition){ <br>  \n" +
                        "//code if condition is true  \n <br>"  +
                        "}else{  \n <br>" +
                        "//code if condition is false  <br>\n" +
                        "}  <br> <br> </li>\n" +

                        "<li> <b>else-if statement </b> The else-if statement contains the if-statement followed by multiple else-if statements. In other words, we can say that it is the chain of if-else statements that create a decision tree where the program may enter any block of code. We can also define an else statement at the end of the chain. <br><b>Syntax: </b> <br> if(condition1){ <br> \n" +
                        "//code to be executed if condition1 is true <br> \n" +
                        "}else if(condition2){  <br> \n" +
                        "//code to be executed if condition2 is true <br> \n" +
                        "} <br> \n" +
                        "else if(condition3){ <br> \n" +
                        "//code to be executed if condition3 is true <br> \n" +
                        "} <br> \n" +
                        "... <br> \n" +
                        "else{ <br> \n" +
                        "//code to be executed if all the conditions are false <br>  \n" +
                        "} <br> <br> </li>\n" +

                        "<li><b>Nested-if statement: </b> In nested if-statements, the if statement contains multiple if-else statements as a separate block of code. <br> <b> Syntax: </b></b> <br> if(condition){   <br> \n" +
                        "     //code to be executed   <br> \n" +
                        "          if(condition){ <br> \n" +
                        "             //code to be executed <br>   \n" +
                        "    }  <br>  \n" +
                        "} <br><br> </li>\n" +
                        "</ol> <br>"+

                "<p><span><b> ii) Switch Statement: </b></span> \n"+
                "<p> In Java, Switch statements are similar to if-else-if statements. The switch statement enables us to check the variable for the range of values defined for multiple case statements. The switch statement is easier to use instead of if-else-if statements. </p>"+

                "<p>While using switch statements, we must notice that the case expression will be of the same type as the variable. However, it will also be a constant value. The switch permits only int, string, and Enum type variables to be used.<br> <b>Syntax: </b> <br> switch <variable> { <br> \n" +
                        "Case <option 1>: <br> \n" +
                        "//block of statements <br> \n" +
                        ".. <br> \n" +
                        ".. <br> \n" +
                        ".. <br> \n" +
                        "Case <option n>: <br> \n" +
                        "//block of statements <br> \n" +
                        "Default: <br> \n" +
                        "//block of statements <br> \n" +
                        "} <br> <br> </p> <br>"+

                "<p><span> <b> 2. Loop Statements: </b> </span></p>\n"+
                "<p> In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true. However, loop statements are used to execute the set of instructions in a repeated order. The execution of the set of instructions depends upon a particular condition. </p>"+
                "<p>In Java, we have three types of loops that execute similarly. However, there are differences in their syntax and condition checking time.</p>"
                +"<ol>\n" +
                        "<li><span><b>for loop:</b></span> In java, for loop is similar to C and C ++. It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. <br> <b>Syntax: </b> <br> for((initialization), (condition), (increment/decrement)) {  <br>" +
                        "//block of statements  <br>" +
                        "} <br> <br>"+

                        "<li><b>while loop : </b> The while loop is also used to iterate over the number of statements multiple times. However, if we don't know the number of iterations in advance, it is recommended to use a while loop. Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop. <br> It is also known as the entry-controlled loop since the condition is checked at the start of the loop. If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed. <br><b>Syntax: </b><br> while(<condition>){ <br>  \n" +
                        "//loop statements <br>  \n" +
                        "}  <br> <br> </li>\n" +

                        "<li><b> do-while loop : </b>  The do-while loop checks the condition at the end of the loop after executing the loop statements. However, it is recommended to use the do-while loop if we don't know the condition in advance, and we need the loop to execute at least once <br> It is also known as the exit-controlled loop since the condition is not checked in advance. <br> <b>Syntax</b> <br> do   \n" +
                        "{ <br> \n" +
                        "//statements <br>  \n" +
                        "} while (<Condition>); <br> <br> </li>\n" +
                        "</ol> <br>" +

                "<p><span> <b> 3. Jump Statements: </b> </span></p>\n"+

                "<p>Jump statements are used to transfer the control of the program to the specific statements. In other words, jump statements transfer the execution control to the other part of the program. There are two types of jump statements in java, i.e., break and continue.</p>"+
                "<ol>\n" +
                        "<li><b>Java break statement: </b> As the name suggests, the break statement is used to break the current flow of the program and transfer the control to the next statement outside the current flow. It is used to break the loop and switch statement. However, it breaks only the inner loop in the case of the nested loop. <br> The break statement cannot be used independently in the java program, i.e., it can only be written inside the loop or switch statement. <br> <b>Syntax: </b> <br> jump-statement;  <br>  \n" +
                        "break;  <br> </li> <br>\n" +
                        "<li><b>Java continue statement: </b> Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately. <br> <b>Syntax: </b> <br> jump-statement;   <br> \n" +
                        "continue;   <br> </li><br> \n"+
                "</ol><br>"




                ,Html.FROM_HTML_MODE_COMPACT));

    }
}