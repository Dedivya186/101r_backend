package com.exception;

import java.util.Scanner;

class InvalidDeposit extends Exception {

    public InvalidDeposit(String msg) {
        super(msg);
    }
}

public class BankAccount {

    public static void deposit(double amount) throws InvalidDeposit {

        if (amount <= 0) {
            throw new InvalidDeposit("Deposit amount must be greater than 0");
        }

        System.out.println("Deposit successful");
        System.out.println("Deposited amount: " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        try {
            deposit(amount);
        }
        catch (InvalidDeposit e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}