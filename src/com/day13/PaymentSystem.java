package com.day13;

abstract class Payment {
    abstract void pay(double amount);
}

class UPIPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through UPI");
    }
}

class CardPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through Card");
    }
}

class CashPayment extends Payment {

    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " through Cash");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        double amount = 1000;

        Payment payment;

        payment = new UPIPayment();
        payment.pay(amount);

        payment = new CardPayment();
        payment.pay(amount);

        payment = new CashPayment();
        payment.pay(amount);
    }
}