package com.exception;

import java.util.Scanner;

class InsufficientBalance extends Exception {

    public InsufficientBalance(String msg) {
        super(msg);
    }
}

class InvalidAmount extends Exception {

    public InvalidAmount(String msg) {
        super(msg);
    }
}

public class Shopping {

    public static void payment(int price, int balance)
            throws InsufficientBalance, InvalidAmount {

        if (price <= 0) {
            throw new InvalidAmount("Invalid Amount");
        }

        if (price > balance) {
            throw new InsufficientBalance("Insufficient Balance");
        }

        balance = balance - price;

        System.out.println("Payment successful");
        System.out.println("Remaining wallet balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        int price = sc.nextInt();

        System.out.print("Enter wallet balance: ");
        int balance = sc.nextInt();

        try {
            payment(price, balance);
        }
        catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmount e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}