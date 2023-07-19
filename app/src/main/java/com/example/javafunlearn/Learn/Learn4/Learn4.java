package com.example.javafunlearn.Learn.Learn4;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn4 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn4);


        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml("<p> <span style= \"font-size: 24sp;\"><b> Java OOPs Concepts</b></span></p> "
                +
                "<p> Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts: \n </p>"
                +
                "<ol>\n" +
                        "<li>Object</li>\n" +
                        "<li>Class</li>\n" +
                        "<li>Inheritance</li>\n" +
                        "<li>Polymorphism</li>\n" +
                        "<li>Abstraction</li>\n" +
                        "<li>Encapsulation</li>\n" +
                        "</ol> <br>"
                +
               "<p> <span style= \"font-size: 24sp;\"><b>Object : </b></span> </p>  Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.\n <br>" +
                        "\n" +
                        "An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing is the type of message accepted and the type of response returned by the objects. <br>\n" +
                        "\n" +
                        "Example: A dog is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, barking, eating, etc. <br> <br>"
                +
                "<p> <span style= \"font-size: 24sp;\"><b> Class : </b></span> Collection of objects is called class. It is a logical entity.\n <br>" +
                        "\n" +
                        "A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space. </p> <br><br>"
                    +
                "<p> <span style= \"font-size: 24sp;\"><b> Inheritance : </b></span> When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism. </p> <br><br>"
                +
                "<p> <span style= \"font-size: 24sp;\"><b> Polymorphism : </b></span>  If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.\n <br>" +
                        "\n" +
                        "In Java, we use method overloading and method overriding to achieve polymorphism.\n <br> " +
                        "\n" +
                        "Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc. </p> <br> <br>"
                +
                "<p> <span style= \"font-size: 24sp;\"><b> Abstraction : </b></span> Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.\n <br>" +
                        "\n" +
                        "In Java, we use abstract class and interface to achieve abstraction. </p> <br><br>"
                +
                "<p> <span style= \"font-size: 24sp;\"><b> Encapsulation : </b></span> Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.\n <br>" +
                        "\n" +
                        "A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here. </p> <br><br>"
                ,Html.FROM_HTML_MODE_COMPACT));
    }
}