package com.example;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello from hello_app3!");
        System.out.println("This is a Maven project example.");
        
        // Example: Display arguments if provided
        if (args.length > 0) {
            System.out.println("Arguments received:");
            for (String arg : args) {
                System.out.println("  - " + arg);
            }
        }
    }
    
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
