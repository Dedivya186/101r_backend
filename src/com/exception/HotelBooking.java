package com.exception;

import java.util.Scanner;

class InvalidRoomRequest extends Exception {
    public InvalidRoomRequest(String msg) {
        super(msg);
    }
}

class RoomsNotAvailable extends Exception {
    public RoomsNotAvailable(String msg) {
        super(msg);
    }
}

public class HotelBooking {

    public static void bookRoom(int availableRooms, int requestedRooms)
            throws InvalidRoomRequest, RoomsNotAvailable {

        if (requestedRooms <= 0) {
            throw new InvalidRoomRequest("Requested rooms must be greater than 0");
        }

        if (requestedRooms > availableRooms) {
            throw new RoomsNotAvailable("Rooms are not available");
        }

        availableRooms = availableRooms - requestedRooms;

        System.out.println("Room booking successful");
        System.out.println("Rooms booked: " + requestedRooms);
        System.out.println("Remaining rooms: " + availableRooms);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available rooms: ");
        int availableRooms = sc.nextInt();

        System.out.print("Enter rooms requested: ");
        int requestedRooms = sc.nextInt();

        try {
            bookRoom(availableRooms, requestedRooms);
        }
        catch (InvalidRoomRequest e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (RoomsNotAvailable e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}