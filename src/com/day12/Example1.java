package com.day12;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog makes sound");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}