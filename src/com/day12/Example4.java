package com.day12;

import java.util.Scanner;

class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        int length = sc.nextInt();

        System.out.print("Width: ");
        int width = sc.nextInt();

        Rectangle r = new Rectangle(length, width);
        r.area();
    }
}