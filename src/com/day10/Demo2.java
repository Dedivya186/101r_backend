package com.day10;

import java.util.Scanner;

class BankAccount {
    int accountNo;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void calculateInterest() {
        double interest = balance * interestRate / 100;

        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();

        System.out.print("Account No: ");
        s.accountNo = sc.nextInt();

        System.out.print("Balance: ");
        s.balance = sc.nextDouble();

        System.out.print("Interest Rate: ");
        s.interestRate = sc.nextDouble();

        s.calculateInterest();
    }
}