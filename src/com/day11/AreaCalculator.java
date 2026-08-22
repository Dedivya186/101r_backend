package com.day11;

class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        AreaCalculator a = new AreaCalculator();

        System.out.println("Area of Square: " + a.area(5));
        System.out.println("Area of Rectangle: " + a.area(10, 5));
        System.out.println("Area of Circle: " + a.area(5.0));
    }
}