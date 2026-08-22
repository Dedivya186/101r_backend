package com.override;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class Main1 {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();

        v.start();
        c.start();
    }
}