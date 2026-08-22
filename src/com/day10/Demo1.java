package com.day10;

import java.util.Scanner;

class Shape {
}

class Rectangle extends Shape {
    int length;
    int breadth;

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Length: ");
        r.length = sc.nextInt();

        System.out.print("Breadth: ");
        r.breadth = sc.nextInt();

        r.calculateArea();
    }
}
