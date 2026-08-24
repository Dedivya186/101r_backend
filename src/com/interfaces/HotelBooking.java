package com.interfaces;

interface RoomBooking {

    void bookRoom();

    void cancelRoom();

    void showRoomDetails();
}

class Hotel implements RoomBooking {

    String customerName;
    int days;
    int roomCharge;
    boolean booked;

    Hotel(String customerName, int days) {
        this.customerName = customerName;
        this.days = days;
        this.roomCharge = 2000;
        this.booked = false;
    }

    public void bookRoom() {
        booked = true;
        System.out.println("Hotel: Room booked successfully");
    }

    public void cancelRoom() {
        booked = false;
        System.out.println("Hotel: Room cancelled");
    }

    public void showRoomDetails() {
        System.out.println("Type: Hotel");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Room Charge: ₹" + roomCharge);
        System.out.println("Total Bill: ₹" + (roomCharge * days));
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class Resort implements RoomBooking {

    String customerName;
    int days;
    int roomCharge;
    boolean booked;

    Resort(String customerName, int days) {
        this.customerName = customerName;
        this.days = days;
        this.roomCharge = 5000;
        this.booked = false;
    }

    public void bookRoom() {
        booked = true;
        System.out.println("Resort: Room booked successfully");
    }

    public void cancelRoom() {
        booked = false;
        System.out.println("Resort: Room cancelled");
    }

    public void showRoomDetails() {
        System.out.println("Type: Resort");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Room Charge: ₹" + roomCharge);
        System.out.println("Total Bill: ₹" + (roomCharge * days));
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

class GuestHouse implements RoomBooking {

    String customerName;
    int days;
    int roomCharge;
    boolean booked;

    GuestHouse(String customerName, int days) {
        this.customerName = customerName;
        this.days = days;
        this.roomCharge = 1000;
        this.booked = false;
    }

    public void bookRoom() {
        booked = true;
        System.out.println("Guest House: Room booked successfully");
    }

    public void cancelRoom() {
        booked = false;
        System.out.println("Guest House: Room cancelled");
    }

    public void showRoomDetails() {
        System.out.println("Type: Guest House");
        System.out.println("Customer: " + customerName);
        System.out.println("Days: " + days);
        System.out.println("Room Charge: ₹" + roomCharge);
        System.out.println("Total Bill: ₹" + (roomCharge * days));
        System.out.println("Status: " + (booked ? "Booked" : "Cancelled"));
    }
}

public class HotelBooking {

    public static void main(String[] args) {

        RoomBooking room;

        room = new Hotel("Sumanjali", 3);
        room.bookRoom();
        room.showRoomDetails();
        room.cancelRoom();

        System.out.println();

        room = new Resort("Rahul", 2);
        room.bookRoom();
        room.showRoomDetails();

        System.out.println();

        room = new GuestHouse("Priya", 4);
        room.bookRoom();
        room.showRoomDetails();
    }
}