package com.day12;

class BankAccount {
    void interest() {
        System.out.println("Bank Account Interest");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void interest() {
        System.out.println("Savings Account Interest: 6%");
    }
}

public class Example5 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.interest();
    }
}