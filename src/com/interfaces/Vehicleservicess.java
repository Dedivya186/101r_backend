package com.interfaces;

interface VehicleService {

    void service();

    void calculateCost();

    void showServiceDetails();
}

class CarService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    int serviceCost;

    CarService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.serviceCost = 3000;
    }

    public void service() {
        System.out.println("Car Service: Oil change, washing and engine check");
    }

    public void calculateCost() {
        System.out.println("Car Service Cost: ₹" + serviceCost);
    }

    public void showServiceDetails() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + ownerName);
    }
}

class BikeService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    int serviceCost;

    BikeService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.serviceCost = 1500;
    }

    public void service() {
        System.out.println("Bike Service: Oil change, chain check and washing");
    }

    public void calculateCost() {
        System.out.println("Bike Service Cost: ₹" + serviceCost);
    }

    public void showServiceDetails() {
        System.out.println("Vehicle Type: Bike");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + ownerName);
    }
}

class TruckService implements VehicleService {

    String vehicleNumber;
    String ownerName;
    int serviceCost;

    TruckService(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.serviceCost = 7000;
    }

    public void service() {
        System.out.println("Truck Service: Engine check, brake check and heavy maintenance");
    }

    public void calculateCost() {
        System.out.println("Truck Service Cost: ₹" + serviceCost);
    }

    public void showServiceDetails() {
        System.out.println("Vehicle Type: Truck");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + ownerName);
    }
}

public class Vehicleservicess {

    public static void main(String[] args) {

        VehicleService vehicle;

        vehicle = new CarService("AP01AB1234", "Sumanjali");
        vehicle.showServiceDetails();
        vehicle.service();
        vehicle.calculateCost();

        System.out.println();

        vehicle = new BikeService("TS09XY5678", "Rahul");
        vehicle.showServiceDetails();
        vehicle.service();
        vehicle.calculateCost();

        System.out.println();

        vehicle = new TruckService("AP05CD9012", "Priya");
        vehicle.showServiceDetails();
        vehicle.service();
        vehicle.calculateCost();
    }
}