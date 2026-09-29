package com.exception;

import java.util.Scanner;

class InvalidPin extends Exception {
    public InvalidPin(String msg) {
        super(msg);
    }
}

class CardBlocked extends Exception {
    public CardBlocked(String msg) {
        super(msg);
    }
}

public class ATMCheck {

    public static void verifyPin(int pin, int attempts)
            throws InvalidPin, CardBlocked {

        if (pin != 1234) {

            if (attempts == 3) {
                throw new CardBlocked("Card Blocked");
            }

            throw new InvalidPin("Incorrect PIN");
        }

        System.out.println("Transaction Allowed");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            attempts++;

            try {
                verifyPin(pin, attempts);
                break;
            }
            catch (InvalidPin e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Attempts remaining: " + (3 - attempts));
            }
            catch (CardBlocked e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        System.out.println("Program completed");
    }
}