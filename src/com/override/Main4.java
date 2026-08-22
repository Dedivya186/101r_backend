package com.override;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main4 {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(),
            new Square()
        };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}