package com.overloading;

class Area {

    // Square
    double calculateArea(int side) {
        return side * side;
    }

    // Rectangle
    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}


public class Shape {

    public static void main(String[] args) {

        Area area = new Area();

        double square = area.calculateArea(5);
        System.out.println("Square Area: " + square);

        double rectangle = area.calculateArea(10, 5);
        System.out.println("Rectangle Area: " + rectangle);

        double circle = area.calculateArea(7.0);
        System.out.println("Circle Area: " + circle);

        double triangle = area.calculateArea(10.0, 6.0);
        System.out.println("Triangle Area: " + triangle);
    }
}
