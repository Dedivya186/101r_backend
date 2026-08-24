package com.interfaces;


interface BankOperations {

    void deposit();

    void withdraw();

    void checkBalance();
}

class SBI implements BankOperations {

    public void deposit() {
        System.out.println("SBI: Deposit successful");
    }

    public void withdraw() {
        System.out.println("SBI: Withdraw successful");
    }

    public void checkBalance() {
        System.out.println("SBI: Balance checked");
    }
}

class HDFC implements BankOperations {

    public void deposit() {
        System.out.println("HDFC: Deposit successful");
    }

    public void withdraw() {
        System.out.println("HDFC: Withdraw successful");
    }

    public void checkBalance() {
        System.out.println("HDFC: Balance checked");
    }
}

class ICICI implements BankOperations {

    public void deposit() {
        System.out.println("ICICI: Deposit successful");
    }

    public void withdraw() {
        System.out.println("ICICI: Withdraw successful");
    }

    public void checkBalance() {
        System.out.println("ICICI: Balance checked");
    }
}

public class Bank {

    public static void main(String[] args) {

        BankOperations bank;

        bank = new SBI();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();

        System.out.println();

        bank = new HDFC();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();

        System.out.println();

        bank = new ICICI();
        bank.deposit();
        bank.withdraw();
        bank.checkBalance();
    }
}