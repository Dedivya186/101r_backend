package com.overriding;

class Vehicle {

    void calculateRent(int days) {
        System.out.println("Calculating vehicle rent");
    }

    void calculateFuelCharge() {
        System.out.println("Calculating fuel charge");
    }

    void startVehicle() {
        System.out.println("Vehicle started");
    }

    void stopVehicle() {
        System.out.println("Vehicle stopped");
    }
}


// Car
class Car extends Vehicle {

    @Override
    void calculateRent(int days) {
        double rent = days * 1500;
        System.out.println("Car Rent: ₹" + rent);
    }

    @Override
    void calculateFuelCharge() {
        System.out.println("Car Fuel Charge: ₹1000");
    }

    @Override
    void startVehicle() {
        System.out.println("Car started using key");
    }

    @Override
    void stopVehicle() {
        System.out.println("Car stopped");
    }
}


// Bike
class Bike extends Vehicle {

    @Override
    void calculateRent(int days) {
        double rent = days * 500;
        System.out.println("Bike Rent: ₹" + rent);
    }

    @Override
    void calculateFuelCharge() {
        System.out.println("Bike Fuel Charge: ₹500");
    }

    @Override
    void startVehicle() {
        System.out.println("Bike started using self-start");
    }

    @Override
    void stopVehicle() {
        System.out.println("Bike stopped");
    }
}


// Truck
class Truck extends Vehicle {

    @Override
    void calculateRent(int days) {
        double rent = days * 3000;
        System.out.println("Truck Rent: ₹" + rent);
    }

    @Override
    void calculateFuelCharge() {
        System.out.println("Truck Fuel Charge: ₹3000");
    }

    @Override
    void startVehicle() {
        System.out.println("Truck engine started");
    }

    @Override
    void stopVehicle() {
        System.out.println("Truck engine stopped");
    }
}


// Main
public class Rental {

    public static void main(String[] args) {

        Car car = new Car();

        car.calculateRent(3);
        car.calculateFuelCharge();
        car.startVehicle();
        car.stopVehicle();

        System.out.println();

        Bike bike = new Bike();

        bike.calculateRent(3);
        bike.calculateFuelCharge();
        bike.startVehicle();
        bike.stopVehicle();

        System.out.println();

        Truck truck = new Truck();

        truck.calculateRent(3);
        truck.calculateFuelCharge();
        truck.startVehicle();
        truck.stopVehicle();
    }
}
