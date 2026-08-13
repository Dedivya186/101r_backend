package com.overloading;

class Calculator {

    // Two integers
    int add(int a, int b) {
        return a + b;
    }

    // Three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Two strings
    String add(String a, String b) {
        return a + b;
    }
}


public class Cal {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Two integers: " + c.add(10, 20));

        System.out.println("Three integers: " + c.add(10, 20, 30));

        System.out.println("Two doubles: " + c.add(10.5, 20.5));

        System.out.println("Two strings: " + c.add("Hello ", "Java"));
    }
}