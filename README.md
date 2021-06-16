# Java Basics

Java is one of the widely used programming languages in the world.

## Lesson 01

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
