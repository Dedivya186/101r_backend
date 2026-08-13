package com.overriding;

class Cab {

    void calculateFare(double distance) {
        System.out.println("Cab fare calculation");
    }

    void calculateWaitingCharge(int minutes) {
        System.out.println("Waiting charge calculation");
    }

    void startRide() {
        System.out.println("Cab ride started");
    }

    void endRide() {
        System.out.println("Cab ride ended");
    }
}


// Mini Cab
class MiniCab extends Cab {

    @Override
    void calculateFare(double distance) {
        double fare = distance * 10;
        System.out.println("Mini Cab Fare: ₹" + fare);
    }

    @Override
    void calculateWaitingCharge(int minutes) {
        double charge = minutes * 2;
        System.out.println("Mini Cab Waiting Charge: ₹" + charge);
    }

    @Override
    void startRide() {
        System.out.println("Mini Cab ride started");
    }

    @Override
    void endRide() {
        System.out.println("Mini Cab ride ended");
    }
}


// Sedan Cab
class SedanCab extends Cab {

    @Override
    void calculateFare(double distance) {
        double fare = distance * 15;
        System.out.println("Sedan Cab Fare: ₹" + fare);
    }

    @Override
    void calculateWaitingCharge(int minutes) {
        double charge = minutes * 3;
        System.out.println("Sedan Cab Waiting Charge: ₹" + charge);
    }

    @Override
    void startRide() {
        System.out.println("Sedan Cab ride started");
    }

    @Override
    void endRide() {
        System.out.println("Sedan Cab ride ended");
    }
}


// Luxury Cab
class LuxuryCab extends Cab {

    @Override
    void calculateFare(double distance) {
        double fare = distance * 25;
        System.out.println("Luxury Cab Fare: ₹" + fare);
    }

    @Override
    void calculateWaitingCharge(int minutes) {
        double charge = minutes * 5;
        System.out.println("Luxury Cab Waiting Charge: ₹" + charge);
    }

    @Override
    void startRide() {
        System.out.println("Luxury Cab ride started");
    }

    @Override
    void endRide() {
        System.out.println("Luxury Cab ride ended");
    }
}


// Main Class
public class Cab_Ride {

    public static void main(String[] args) {

        MiniCab mini = new MiniCab();

        mini.startRide();
        mini.calculateFare(10);
        mini.calculateWaitingCharge(15);
        mini.endRide();

        System.out.println();

        SedanCab sedan = new SedanCab();

        sedan.startRide();
        sedan.calculateFare(10);
        sedan.calculateWaitingCharge(15);
        sedan.endRide();

        System.out.println();

        LuxuryCab luxury = new LuxuryCab();

        luxury.startRide();
        luxury.calculateFare(10);
        luxury.calculateWaitingCharge(15);
        luxury.endRide();
    }
}
