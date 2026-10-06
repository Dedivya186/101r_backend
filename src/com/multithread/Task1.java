package com.multithread;
class BankAccount {

    int balance = 5000;

    synchronized void deposit(int amount) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Deposit Amount: " + amount);

        balance = balance + amount;

        System.out.println("Updated Balance: " + balance);
        System.out.println();
    }

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Withdraw Amount: " + amount);

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient Funds");
        }

        System.out.println();
    }
}


class CustomerThread extends Thread {

    BankAccount account;

    CustomerThread(BankAccount account) {
        this.account = account;
    }

    public void run() {

        account.deposit(1000);
        account.withdraw(2000);
    }
}


public class Task1 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        CustomerThread t1 = new CustomerThread(account);
        CustomerThread t2 = new CustomerThread(account);

//        t1.setName("Customer-1");
//        t2.setName("Customer-2");

        t1.start();
        t2.start();
    }
}