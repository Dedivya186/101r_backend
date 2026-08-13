package com.overriding;

class Payment {

    void processPayment(double amount) {
        System.out.println("Processing payment");
    }

    void validatePayment() {
        System.out.println("Validating payment");
    }

    void generateReceipt() {
        System.out.println("Generating receipt");
    }

    void refundPayment(double amount) {
        System.out.println("Refunding payment");
    }
}


// UPI Payment
class UPIPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("UPI Payment processed: ₹" + amount);
    }

    @Override
    void validatePayment() {
        System.out.println("UPI PIN validated successfully");
    }

    @Override
    void generateReceipt() {
        System.out.println("UPI receipt generated");
    }

    @Override
    void refundPayment(double amount) {
        System.out.println("UPI refund processed: ₹" + amount);
    }
}


// Credit Card Payment
class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Credit Card Payment processed: ₹" + amount);
    }

    @Override
    void validatePayment() {
        System.out.println("Credit Card and CVV validated");
    }

    @Override
    void generateReceipt() {
        System.out.println("Credit Card receipt generated");
    }

    @Override
    void refundPayment(double amount) {
        System.out.println("Credit Card refund processed: ₹" + amount);
    }
}


// Net Banking Payment
class NetBankingPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Net Banking Payment processed: ₹" + amount);
    }

    @Override
    void validatePayment() {
        System.out.println("Net Banking credentials validated");
    }

    @Override
    void generateReceipt() {
        System.out.println("Net Banking receipt generated");
    }

    @Override
    void refundPayment(double amount) {
        System.out.println("Net Banking refund processed: ₹" + amount);
    }
}


// Main
public class Pay {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPIPayment();
        payment.validatePayment();
        payment.processPayment(500);
        payment.generateReceipt();
        payment.refundPayment(100);

        System.out.println();

        payment = new CreditCardPayment();
        payment.validatePayment();
        payment.processPayment(1000);
        payment.generateReceipt();
        payment.refundPayment(200);

        System.out.println();

        payment = new NetBankingPayment();
        payment.validatePayment();
        payment.processPayment(2000);
        payment.generateReceipt();
        payment.refundPayment(500);
    }
}
