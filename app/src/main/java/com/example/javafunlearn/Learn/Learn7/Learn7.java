package com.example.javafunlearn.Learn.Learn7;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.javafunlearn.R;

public class Learn7 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn7);


        TextView learn = findViewById(R.id.learn);

        learn.setMovementMethod(new ScrollingMovementMethod());

        learn.setText(Html.fromHtml("<b>Packages: java.io and java.lang Package in Java : </b><br><br>"
        +
                "<b>Package :java.io :</b>"+
                "<p>This package provides for system input and output through data streams, serialization and the file system. Unless otherwise noted, passing a null argument to a constructor or method in any class or interface in this package will cause a NullPointerException to be thrown.</p>"
        +
                        "<p><b>Following are the important classes in Java.io package:</b></p><br>"
        +
        "BufferedInputStream\n <br>" +
                        "BufferedOutputStream\n<br>" +
                        "BufferedReader <br>\n" +
                        "BufferedWriter <br>\n" +
                        "ByteArrayInputStream <br>\n" +
                        "ByteArrayOutputStream<br>\n" +
                        "CharArrayReader <br> \n" +
                        "CharArrayWriter – Set1 Set2 <br>\n" +
                        "Console <br>\n" +
                        "DataInputStream – Set1 Set2 <br>\n" +
                        "DataOutputStream <br>n" +
                        "File <br>\n" +
                        "FileDescriptor <br>\n" +
                        "FileInputStream <br>\n" +
                        "FileOutputStream <br>\n" +
                        "FilePermission<br>\n" +
                        "FileReader and FileWriter<br>\n" +
                        "FilterInputStream<br>\n" +
                        "FilterOutputStream<br>\n" +
                        "FilterReader<br>\n" +
                        "FilterWriter<br>\n" +
                        "InputStream<br>\n" +
                        "InputStreamReader<br>\n" +
                        "LineNumberInputStream<br>\n" +
                        "LineNumberReader<br>\n" +
                        "ObjectInputStream – Set1 Set2<br>\n" +
                        "ObjectInputStream.GetField<br>\n" +
                        "ObjectOutputStream – Set 1 Set2<br>\n" +
                        "ObjectOutputStream.PutField<br>\n" +
                        "ObjectStreamClass<br>\n" +
                        "ObjectStreamField <br>\n" +
                        "OutputStream<br>\n" +
                        "OutputStreamWriter<br>\n" +
                        "PipedInputStream<br>\n" +
                        "PipedOutputStream<br>\n" +
                        "PipedReader <br> \n" +
                        "PipedWriter <br>\n" +
                        "PrintStream – Set1   Set2 <br>\n" +
                        "PrintWriter – Set1  Set2 <br>\n" +
                        "PushbackInputStream <br>\n" +
                        "PushbackReader <br> \n" +
                        "RandomAccessFile- Set1 Set2 Set3 <br>\n" +
                        "Reader <br>\n" +
                        "SequenceInputStream <br>\n" +
                        "SerializablePermission <br>\n" +
                        "StreamTokenizer – Set1 Set2 <br>\n" +
                        "StringBufferInputStream <br>\n" +
                        "StringReader <br>\n" +
                        "StringWriter <br>\n" +
                        "Writer <br>\n" +
                        "ZipInputStream class in Java<br>\n" +
                        "ZipEntry class in Java<br>\n" +
                        "JarEntry class in Java<br>\n" +
                        "ZipOutputStream class in Java<br>\n" +
                        "Zip.InflaterInputStream class in Java <br>\n" +
                        "Zip.DeflaterInputStream class in Java<br>\n" +
                        "Zip.DeflaterOutputStream class in Java <br> <br>"

                +
                "<b>Package: java.lang :</b>"
                +
                "<p> Provides classes that are fundamental to the design of the Java programming language. The most important classes are Object, which is the root of the class hierarchy, and Class, instances of which represent classes at run time. </p>"
                +
                "<p><b> Following are the Important Classes in Java.lang package : </b></p><br>"
                +
                "<b>Boolean: </b>The Boolean class wraps a value of the primitive type boolean in an object. <br> \n" +
                        "<b>Byte: </b>The Byte class wraps a value of primitive type byte in an object. <br> \n" +
                        "<b>Character – Set 1, Set 2: </b>The Character class wraps a value of the primitive type char in an object. <br>\n" +
                        "<b>Character.Subset:</b> Instances of this class represent particular subsets of the Unicode character set.<br>\n" +
                        "<b>Character.UnicodeBlock: </b>A family of character subsets representing the character blocks in the Unicode specification.<br>\n" +
                        "<b>Class – Set 1, Set 2 : </b>Instances of the class Class represent classes and interfaces in a running Java application.<br>\n" +
                        "<b>ClassLoader: </b> A class loader is an object that is responsible for loading classes.<br>\n" +
                        "<b>ClassValue:</b> Lazily associate a computed value with (potentially) every type.<br>\n" +
                        "<b>Compiler: </b>The Compiler class is provided to support Java-to-native-code compilers and related services.<br>\n" +
                        "<b>Double: </b>The Double class wraps a value of the primitive type double in an object.<br>\n" +
                        "<b>Enum: </b>This is the common base class of all Java language enumeration types.<br>\n" +
                        "<b>Float: </b>The Float class wraps a value of primitive type float in an object.<br>\n" +
                        "<b>InheritableThreadLocal: </b>This class extends ThreadLocal to provide inheritance of values from parent thread to child thread: when a child thread is created, the child receives initial values for all inheritable thread-local variables for which the parent has values.<br>\n" +
                        "<b>Integer : </b>The Integer class wraps a value of the primitive type int in an object.<br> \n" +
                        "<b>Long: </b> The Long class wraps a value of the primitive type long in an object. <br>\n" +
                        "<b>Math – Set 1, Set 2:</b> The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.<br>\n" +
                        "<b>Number: </b>The abstract class Number is the superclass of classes BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short.<br>\n" +
                        "<b>Object:</b> Class Object is the root of the class hierarchy.<br>\n" +
                        "<b>Package:</b> Package objects contain version information about the implementation and specification of a Java package. <br>\n" +
                        "<b>Process:</b> The ProcessBuilder.start() and Runtime.exec methods create a native process and return an instance of a subclass of Process that can be used to control the process and obtain information about it. <br>\n" +
                        "<b>ProcessBuilder:</b> This class is used to create operating system processes. <br>\n" +
                        "<b>ProcessBuilder.Redirect:</b> Represents a source of subprocess input or a destination of subprocess output. <br>\n" +
                        "<b>Runtime:</b> Every Java application has a single instance of class Runtime that allows the application to interface with the environment in which the application is running. <br>\n" +
                        "<b>RuntimePermission:</b> This class is for runtime permissions. <br>\n" +
                        "<b>SecurityManager: </b>The security manager is a class that allows applications to implement a security policy.<br>\n" +
                        "<b>Short: </b>The Short class wraps a value of primitive type short in an object. <br>\n" +
                        "<b>StackTraceElement:</b> An element in a stack trace, as returned by Throwable.getStackTrace().<br>\n" +
                        "<b>StrictMath- Set1, Set2: </b>The class StrictMath contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.<br>\n" +
                        "<b>String- Set1, Set2: </b>The String class represents character strings. <br>\n" +
                        "<b>StringBuffer:</b> A thread-safe, mutable sequence of characters.<br>\n" +
                        "<b>StringBuilder: </b>A mutable sequence of characters.<br>\n" +
                        "<b>System: </b>The System class contains several useful class fields and methods. <br>\n" +
                        "<b>Thread:</b> A thread is a thread of execution in a program.<br>\n" +
                        "<b>ThreadGroup:</b> A thread group represents a set of threads.<br>\n" +
                        "<b>ThreadLocal:</b> This class provides thread-local variables.<br>\n" +
                        "<b>Throwable: </b> The Throwable class is the superclass of all errors and exceptions in the Java language. <br>\n" +
                        "<b>Void:</b> The Void class is an uninstantiable placeholder class to hold a reference to the Class object representing the Java keyword void. <br><br>"

                ,Html.FROM_HTML_MODE_COMPACT));
    }
}