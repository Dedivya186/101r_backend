package com.constructor;

class Mobile {

    String brand;
    String model;
    double price;

    Mobile() {
        System.out.println("No-Argument Constructor\n");
    }

    Mobile(String brand) {
        this();
        this.brand = brand;

        System.out.println("One-Argument Constructor");
        System.out.println("Brand : " + brand);
        System.out.println();
    }

    Mobile(String brand, String model, double price) {
        this(brand);
        this.model = model;
        this.price = price;

        System.out.println("Three-Argument Constructor");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobileDemo {
    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung", "S24", 80000);
    }
}