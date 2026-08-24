package com.interfaces;

interface PaymentGateway {

    void makePayment();

    void refund();

    void checkTransaction();
}

class UPIPayment implements PaymentGateway {

    double amount;
    String transactionId;

    UPIPayment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("UPI Payment: Payment successful");
        System.out.println("Amount: ₹" + amount);
    }

    public void refund() {
        System.out.println("UPI Payment: Refund initiated");
    }

    public void checkTransaction() {
        System.out.println("UPI Transaction ID: " + transactionId);
    }
}

class CardPayment implements PaymentGateway {

    double amount;
    String transactionId;

    CardPayment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("Card Payment: Payment successful");
        System.out.println("Amount: ₹" + amount);
    }

    public void refund() {
        System.out.println("Card Payment: Refund initiated");
    }

    public void checkTransaction() {
        System.out.println("Card Transaction ID: " + transactionId);
    }
}

class NetBanking implements PaymentGateway {

    double amount;
    String transactionId;

    NetBanking(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public void makePayment() {
        System.out.println("Net Banking: Payment successful");
        System.out.println("Amount: ₹" + amount);
    }

    public void refund() {
        System.out.println("Net Banking: Refund initiated");
    }

    public void checkTransaction() {
        System.out.println("Net Banking Transaction ID: " + transactionId);
    }
}

public class Payment {

    public static void main(String[] args) {

        PaymentGateway payment;

        payment = new UPIPayment(1000, "UPI101");
        payment.makePayment();
        payment.checkTransaction();
        payment.refund();

        System.out.println();

        payment = new CardPayment(2500, "CARD102");
        payment.makePayment();
        payment.checkTransaction();
        payment.refund();

        System.out.println();

        payment = new NetBanking(5000, "NET103");
        payment.makePayment();
        payment.checkTransaction();
        payment.refund();
    }
}