package com.example.javafunlearn.Learn.Learn6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn6 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn6);

        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml(" <b>Inheritance in Java : </b>"
                +
                "<br><p> Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).\n <br>" +
                        "\n" +
                        "The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.\n <br>" +
                        "\n" +
                        "Inheritance represents the IS-A relationship which is also known as a parent-child relationship. </p> <br>"
                +
                "<b>Why use inheritance in java?</b><br>"
                +
                "<ul" +
                        "<li>For Method Overriding.</li>\n" +
                        "<li>For Code Reusability.</li>\n" +
                        "</ul> <br>"
                +
                "<b>Terms used in Inheritance : </b> <br>"
                +
                "<ul>\n" +
                        "<li><strong>Class:</strong> A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.</li>\n" +
                        "<li><strong>Sub Class/Child Class:</strong> Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class. </li>\n" +
                        "<li><strong>Super Class/Parent Class:</strong> Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.</li>\n" +
                        "<li><strong>Reusability:</strong> As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class. </li>\n" +
                        "</ul>"
                +
                "<b> The syntax of Java Inheritance: </b><br>"
                +
                "class Subclass-name extends Superclass-name  \n <br>" +
                        "{  \n <br>" +
                        "   //methods and fields <br> \n" +
                        "} <br>  <p>he \"extends\" keyword indicates that you are making a new class that derives from an existing class. The meaning of \"extends\" is to increase the functionality.\n" +
                        "\n" +
                        "In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.</p><br>"
                +
                "<ol>\n" +
                "<p><b>Types of Inheritance in Java: </b></p> <br>"+
                        "<li><b>Single Inheritance : </b>  When a class inherits another class, it is known as a single inheritance. <br> Example: <br>class Animal{  \n <br>" +
                        "void eat(){System.out.println(\"eating...\");} <br> \n" +
                        "} <br> \n" +
                        "class Dog extends Animal{  <br> \n" +
                        "void bark(){System.out.println(\"barking...\");} <br> \n" +
                        "} <br> <br> </li>\n" +
                        "\n" +


                        "<li><b>Multi level inheritance :</b> When a class inherits another class, it is known as a single inheritance. <br> Example: <br>class Animal{ <br>  \n" +
                        "void eat(){System.out.println(\"eating...\");}  <br>\n" +
                        "}<br>  \n" +
                        "class Dog extends Animal{  \n" +
                        "void bark(){System.out.println(\"barking...\");} <br> \n" +
                        "} <br> \n" +
                        "class BabyDog extends Dog{ <br> \n" +
                        "void weep(){System.out.println(\"weeping...\");} <br> \n" +
                        "} <br> <br></li>\n" +
                        "\n" +


                        "<li><b>Hierarchical Inheritance :</b> When two or more classes inherits a single class, it is known as hierarchical inheritance. <br>Example: <br>class Animal{  \n <br>" +
                        "void eat(){System.out.println(\"eating...\");} <br> \n" +
                        "} <br> \n" +
                        "class Dog extends Animal{  \n" +
                        "void bark(){System.out.println(\"barking...\");}<br>  \n" +
                        "}  <br>\n" +
                        "class Cat extends Animal{  <br>\n" +
                        "void meow(){System.out.println(\"meowing...\");} <br> \n" +
                        "}   <br> </li>\n"
                +
                "</ol> <br>"

                ,Html.FROM_HTML_MODE_COMPACT));

    }
}