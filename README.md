# Java Basics

Java is one of the widely used programming languages in the world.

## Lesson 01 (Basic Intro)

1. Applications including,
   - Web Applications
   - Mobile Applications
   - Desktop Applications
   - Web Servers
   - Embedded Systems, and many more variants can be developed using java.
2. JRE (Java Runtime Environment) is required to run java programs and as a result of that it is platform independent.
3. Every java program has to have at least one class.

```java
public class HelloWorld {

}
```

4. Main function is the entry point to any java application

```java
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
    }

}
```

5. When saving a java file(.java), class name, and the file name should match.
6. Java program can be complied using the command, and it will then compile the program and generate necessary files.

```console
foo@bar:~ javac filename.java
```

7. Then executed using the command, and the program will be executed on the terminal.

```console
foo@bar:~ java filename
```

## Lesson 02 (Data Types)

1. Information which is stored and processed by a computer can be considered as data.
2. Data Types are classification of data which instructs the compiler/interpreter about the intended use of that data. There are two main classification of dta types :
   - Primitive Data Types (Boolean, int, double, char)
   - Reference Data Types
3. Variables are reusable containers for different types of data. It has a data type, label, and a value.
```java
public class Main {
   public static void main(String[] args) {
      int label = 25;
   }
}
```

## Lesson 03 (Inputs and Outputs)

1. To take inputs first we need to import java.util.Scanner class.
2. Then it is required to define an input object to read the input and assign it to a variable.
```java
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int num1;
      int num2;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter first number :");
      num1 = input.nextInt();
      System.out.println("Enter second number :");
      num2 = input.nextInt();
      System.out.println("Your total is "+(num1+num2));
   }
}
```