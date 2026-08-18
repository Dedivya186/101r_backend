package com.day9;

import java.util.Scanner;

class ATM {
    private int pin;
    private double balance;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    private boolean validatePin(int enteredPin) {
        return pin == enteredPin;
    }

    public void checkBalance(int enteredPin) {
        if (validatePin(enteredPin)) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void deposit(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount > 0) {
                balance += amount;
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public void withdraw(int enteredPin, double amount) {
        if (validatePin(enteredPin)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Invalid Withdrawal");
            }
        } else {
            System.out.println("Invalid PIN");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("PIN: ");
        int pin = sc.nextInt();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        ATM atm = new ATM(pin, balance);

        System.out.print("Withdraw: ");
        double amount = sc.nextDouble();

        System.out.print("Enter PIN again: ");
        int enteredPin = sc.nextInt();

        atm.withdraw(enteredPin, amount);
    }
}