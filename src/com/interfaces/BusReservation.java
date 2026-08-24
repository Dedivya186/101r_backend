package com.interfaces;

interface BusBooking {

    void bookSeat();

    void cancelSeat();

    void showBooking();
}

class APSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    int ticketPrice;
    boolean seatBooked;

    APSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 500;
        this.seatBooked = false;
    }

    public void bookSeat() {
        seatBooked = true;
        System.out.println("APSRTC: Seat booked successfully");
    }

    public void cancelSeat() {
        seatBooked = false;
        System.out.println("APSRTC: Seat cancelled");
    }

    public void showBooking() {
        System.out.println("Bus Service: APSRTC");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Seat Status: " + (seatBooked ? "Booked" : "Available"));
    }
}

class TSRTC implements BusBooking {

    String passengerName;
    String source;
    String destination;
    int ticketPrice;
    boolean seatBooked;

    TSRTC(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 600;
        this.seatBooked = false;
    }

    public void bookSeat() {
        seatBooked = true;
        System.out.println("TSRTC: Seat booked successfully");
    }

    public void cancelSeat() {
        seatBooked = false;
        System.out.println("TSRTC: Seat cancelled");
    }

    public void showBooking() {
        System.out.println("Bus Service: TSRTC");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Seat Status: " + (seatBooked ? "Booked" : "Available"));
    }
}

class PrivateBus implements BusBooking {

    String passengerName;
    String source;
    String destination;
    int ticketPrice;
    boolean seatBooked;

    PrivateBus(String passengerName, String source, String destination) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = 800;
        this.seatBooked = false;
    }

    public void bookSeat() {
        seatBooked = true;
        System.out.println("Private Bus: Seat booked successfully");
    }

    public void cancelSeat() {
        seatBooked = false;
        System.out.println("Private Bus: Seat cancelled");
    }

    public void showBooking() {
        System.out.println("Bus Service: Private Bus");
        System.out.println("Passenger: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: ₹" + ticketPrice);
        System.out.println("Seat Status: " + (seatBooked ? "Booked" : "Available"));
    }
}

public class BusReservation {

    public static void main(String[] args) {

        BusBooking bus;

        bus = new APSRTC("Sumanjali", "Hyderabad", "Vijayawada");
        bus.bookSeat();
        bus.showBooking();
        bus.cancelSeat();
        bus.showBooking();

        System.out.println();

        bus = new TSRTC("Rahul", "Hyderabad", "Warangal");
        bus.bookSeat();
        bus.showBooking();

        System.out.println();

        bus = new PrivateBus("Priya", "Hyderabad", "Bangalore");
        bus.bookSeat();
        bus.showBooking();
    }
}