package com.interfaces;

interface RailwayService {

    void bookTicket();

    void cancelTicket();

    void showTicket();
}

class ExpressTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    int fare;
    int ticketNumber;
    boolean booked;

    ExpressTrain(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = 500;
        this.ticketNumber = 101;
        this.booked = false;
    }

    public void bookTicket() {
        booked = true;
        System.out.println("Express Train: Ticket booked");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("Express Train: Ticket cancelled");
    }

    public void showTicket() {
        System.out.println("Train: Express Train");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class SuperFastTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    int fare;
    int ticketNumber;
    boolean booked;

    SuperFastTrain(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = 800;
        this.ticketNumber = 102;
        this.booked = false;
    }

    public void bookTicket() {
        booked = true;
        System.out.println("SuperFast Train: Ticket booked");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("SuperFast Train: Ticket cancelled");
    }

    public void showTicket() {
        System.out.println("Train: SuperFast Train");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class LocalTrain implements RailwayService {

    String passengerName;
    String source;
    String destination;
    int fare;
    int ticketNumber;
    boolean booked;

    LocalTrain(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = 200;
        this.ticketNumber = 103;
        this.booked = false;
    }

    public void bookTicket() {
        booked = true;
        System.out.println("Local Train: Ticket booked");
    }

    public void cancelTicket() {
        booked = false;
        System.out.println("Local Train: Ticket cancelled");
    }

    public void showTicket() {
        System.out.println("Train: Local Train");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: ₹" + fare);
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class RailwayReservation {

    public static void main(String[] args) {

        RailwayService railway;

        railway = new ExpressTrain(
                "Sumanjali",
                "Hyderabad",
                "Vijayawada"
        );

        railway.bookTicket();
        railway.showTicket();
        railway.cancelTicket();
        railway.showTicket();

        System.out.println();

        railway = new SuperFastTrain(
                "Rahul",
                "Hyderabad",
                "Chennai"
        );

        railway.bookTicket();
        railway.showTicket();

        System.out.println();

        railway = new LocalTrain(
                "Priya",
                "Secunderabad",
                "Warangal"
        );

        railway.bookTicket();
        railway.showTicket();
    }
}