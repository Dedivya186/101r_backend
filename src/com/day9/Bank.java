package com.day9;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        System.out.print("Deposit: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Withdraw: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
