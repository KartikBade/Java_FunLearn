package com.example.javafunlearn.Learn.Learn5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn5 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn5);

        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml("<p> <span style= \"font-size: 24sp;\"><b> Classes and Methods </b></span></p> <br>"
                +
                "<b> Class : </b> <br>"+
                "<p>A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical. \n <br>" +
                "Everything in Java is associated with classes and objects, along with its attributes and methods. You can create multiple objects of one class.<br> For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.<br>\n" +
                        "\n" +
                        "A Class is like an object constructor, or a \"blueprint\" for creating objects. <br>"+
                        "\n" +
                        "A class in Java can contain: </p> <br>"
                +
                "<ol>\n" +
                        "<li>Fields</li>\n" +
                        "<li>Methods</li>\n" +
                        "<li>Constructors</li>\n" +
                        "<li>Blocks</li>\n" +
                        "<li>Nested class and interface</li>\n" +
                        "</ol> <br>"
                +
                "<p><b>Syntax to declare a class:</b></p>"
                +
                "class <class_name>{  \n <br>" +
                        "    field;  \n <br>" +
                        "    method;  \n <br>" +
                        "} <br> "
                +
                "<b> Methods : </b> <br>"
                +
                "<p> A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it. <br> The most important method in Java is the main() method. If you want to read more about the main() method.</p> <br>"
                +
                "<b> Method Declaration : </b>"
                +
                "<p>The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header</p>"
                +
                "<ol>\n" +
                        "<li><b>Method Signature: </b>  Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.</li>\n" +
                        "\n" +
                        "<li><b>Access Specifier:</b> Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:\n" +
                        "<ul>\n" +
                        "&emsp; <li> Public: The method is accessible by all classes when we use public specifier in our application.</li>\n" +
                        "&emsp; <li>Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.</li>\n" +
                        "&emsp; <li>Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.</li>\n" +
                        "&emsp; <li>Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.</li>\n" +
                        " </ul>\n" +
                        "</li>\n" +
                        "\n" +
                        "<li><b>Return Type:</b> Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.</li>\n" +
                        "\n" +
                        "<li><b>Method Name:</b> It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.</li>\n" +
                        "\n" +
                        "<li><b>Parameter List:</b> It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.</li>\n" +
                        "\n" +
                        "<li><b>Method Body:</b> It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces.</li>\n" +
                        "</ol> <br><br>\n"
                +
                "<b>Naming a Method : </b> ,<br>"
                +
                "<p>While defining a method, remember that the method name must be a <strong>verb</strong> and start with a <strong>lowercase</strong> letter. If the method name has more than two words, the first name must be a verb followed by adjective or noun. In the multi-word method name, the first letter of each word must be in <strong>uppercase</strong> except the first word. For example:</p>\n" +
                        "<p><strong>Single-word method name:</strong> sum(), area()</p>\n" +
                        "<p><strong>Multi-word method name:</strong> areaOfCircle(), stringComparision()</p>\n" +
                        "<p>It is also possible that a method has the same name as another method name in the same class, it is known as <strong>method overloading</strong>.</p>"
                +
                "<b>There are 2 types of Methods : </b>"
                +
                "<ul>\n" +
                        "<li><b>Predefined Method : </b>  In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc. When we call any of the predefined methods in our program, a series of codes related to the corresponding method runs in the background that is already stored in the library.\n <br>" +
                        "\n" +
                        "Each and every predefined method is defined inside a class. Such as print() method is defined in the java.io.PrintStream class. It prints the statement that we write inside the method. For example, print(\"Java\"), it prints Java on the console. </li>\n" +
                        "<li><b>User-defined Method : </b> The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement. A user can name it, add parameters and much more according to their choice.</li>\n" +
                        "</ul> <br> <br>\n"
                +
                "<b>Static Method: </b> <br>"+
                "<p> A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method. We can also create a static method by using the keyword static before the method name.\n<br>" +
                        "\n" +
                        "The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.</p> <br><br>"
                        +
                "<b>Instance Method: </b> <br>" +
                        "<p>The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class. There are Two types of instance methods: </p> "+
                "<ul><li><strong>Accessor Method : </strong> The method(s) that reads the instance variable(s) is known as the accessor method. We can easily identify it because the method is prefixed with the word get. It is also known as getters. It returns the value of the private field. It is used to get the value of the private field.</li>\n" +

                        "<li><strong>Mutator Method : </strong> The method(s) read the instance variable(s) and also modify the values. We can easily identify it because the method is prefixed with the word set. It is also known as setters or modifiers. It does not return anything. It accepts a parameter of the same data type that depends on the field. It is used to set the value of the private field.\n </li>\n" +
                        "</ul> <br><br>"
                +
                "<b>Abstract Method: </b> <br>"
                +
                "<p>The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must be abstract if it has abstract method. To create an abstract method, we use the keyword abstract.<br> <b>Syntax:</b> abstract void method_name();  <br></p>"




                , Html.FROM_HTML_MODE_COMPACT));

    }
}