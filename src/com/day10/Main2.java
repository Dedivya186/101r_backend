package com.day10;

import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Sound: Bark");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Animal: ");
        String animal = sc.nextLine();

        Dog d = new Dog();
        d.sound();
    }
}