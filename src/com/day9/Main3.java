package com.day9;

import java.util.Scanner;

class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void spendMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        Wallet wallet = new Wallet(balance);

        System.out.print("Add: ");
        double add = sc.nextDouble();
        wallet.addMoney(add);

        System.out.print("Spend: ");
        double spend = sc.nextDouble();
        wallet.spendMoney(spend);

        System.out.println("Final Balance: " + wallet.getBalance());
    }
}
