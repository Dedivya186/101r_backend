package com.day10;

import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String model;

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Brand: ");
        c.brand = sc.nextLine();

        System.out.print("Model: ");
        c.model = sc.nextLine();

        System.out.print("Speed: ");
        c.speed = sc.nextInt();

        c.displayCar();
    }
}