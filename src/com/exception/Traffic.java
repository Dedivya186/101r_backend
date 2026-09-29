package com.exception;

import java.util.Scanner;

class InvalidSpeed extends Exception {
    public InvalidSpeed(String msg) {
        super(msg);
    }
}

class OverSpeeding extends Exception {
    public OverSpeeding(String msg) {
        super(msg);
    }
}

public class Traffic {

    public static void checkSpeed(String vehicleNumber, int speed)
            throws InvalidSpeed, OverSpeeding {

        if (speed < 0) {
            throw new InvalidSpeed("Speed cannot be negative");
        }

        if (speed > 100) {
            throw new OverSpeeding("Over Speeding");
        }

        if (speed >= 80 && speed <= 100) {
            System.out.println("Warning: High Speed");
        } else {
            System.out.println("Speed Normal");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter current speed: ");
        int speed = sc.nextInt();

        try {
            checkSpeed(vehicleNumber, speed);
        }
        catch (InvalidSpeed e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (OverSpeeding e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Program completed");
    }
}