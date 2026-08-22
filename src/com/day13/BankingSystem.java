package com.day13;

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(10000);
        CurrentAccount current = new CurrentAccount(10000);

        savings.deposit(5000);
        savings.withdraw(3000);

        current.deposit(5000);
        current.withdraw(3000);

        savings.displayBalance();
        current.displayBalance();
    }
}