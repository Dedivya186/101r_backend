package com.problemsolving;

class Vehicle {
    private String vehicleNumber;
    private String brand;
    protected double rentPerDay;

    Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle : " + brand);
        System.out.println("Number  : " + vehicleNumber);
        System.out.println("Rent/Day: " + rentPerDay);
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        double baseRent = rentPerDay * days;
        double serviceCharge = baseRent * 0.10;

        return baseRent + serviceCharge;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        double baseRent = rentPerDay * days;
        double serviceCharge = baseRent * 0.05;

        return baseRent + serviceCharge;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        double baseRent = rentPerDay * days;
        double serviceCharge = baseRent * 0.15;

        return baseRent + serviceCharge;
    }
}

public class Main2 {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car("AP39AB1234", "Car", 2000);

        v.displayVehicleDetails();

        int days = 3;

        double baseRent = 2000 * days;
        double serviceCharge = baseRent * 0.10;

        System.out.println("Days    : " + days);
        System.out.println();
        System.out.println("Base Rent      : " + baseRent);
        System.out.println("Service Charge : " + serviceCharge);
        System.out.println("Final Rent     : " + v.calculateRent(days));

        System.out.println();

        v = new Bike("AP39CD5678", "Bike", 1000);
        v.displayVehicleDetails();
        System.out.println("Final Rent : " + v.calculateRent(3));

        System.out.println();

        v = new Truck("AP39EF9876", "Truck", 5000);
        v.displayVehicleDetails();
        System.out.println("Final Rent : " + v.calculateRent(3));
    }
}