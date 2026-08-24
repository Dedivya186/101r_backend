package com.interfaces;


interface TicketBooking {

    void bookTicket();

    void cancelTicket();

    void showTicketDetails();
}

class PVR implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;

    PVR(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    public void bookTicket() {
        System.out.println("PVR: Ticket booked successfully");
    }

    public void cancelTicket() {
        System.out.println("PVR: Ticket cancelled");
    }

    public void showTicketDetails() {
        System.out.println("Theatre: PVR");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Customer: " + customerName);
    }
}

class INOX implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;

    INOX(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    public void bookTicket() {
        System.out.println("INOX: Ticket booked successfully");
    }

    public void cancelTicket() {
        System.out.println("INOX: Ticket cancelled");
    }

    public void showTicketDetails() {
        System.out.println("Theatre: INOX");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Customer: " + customerName);
    }
}

class Cinepolis implements TicketBooking {

    String movieName;
    int seatNumber;
    String customerName;

    Cinepolis(String movieName, int seatNumber, String customerName) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.customerName = customerName;
    }

    public void bookTicket() {
        System.out.println("Cinepolis: Ticket booked successfully");
    }

    public void cancelTicket() {
        System.out.println("Cinepolis: Ticket cancelled");
    }

    public void showTicketDetails() {
        System.out.println("Theatre: Cinepolis");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Customer: " + customerName);
    }
}

public class MovieBooking {

    public static void main(String[] args) {

        TicketBooking ticket;

        ticket = new PVR("Pushpa 2", 101, "Sumanjali");
        ticket.bookTicket();
        ticket.showTicketDetails();
        ticket.cancelTicket();

        System.out.println();

        ticket = new INOX("Devara", 202, "Rahul");
        ticket.bookTicket();
        ticket.showTicketDetails();
        ticket.cancelTicket();

        System.out.println();

        ticket = new Cinepolis("OG", 303, "Priya");
        ticket.bookTicket();
        ticket.showTicketDetails();
        ticket.cancelTicket();
    }
}