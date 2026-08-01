package com.constructor;

class Vehicle {

    String brand;
    double price;

    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;

        System.out.println("Vehicle Constructor Called");
        System.out.println();
    }
}

class Car extends Vehicle {

    String model;

    Car(String brand, double price, String model) {
        super(brand, price);
        this.model = model;

        System.out.println("Car Constructor Called");
        System.out.println();
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {

        Car c = new Car("Hyundai", 1500000, "Creta");
        System.out.println();
        c.display();
    }
}