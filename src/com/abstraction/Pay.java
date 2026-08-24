package com.abstraction;

abstract class Payment {

    abstract void processPayment();

    abstract void validateTransaction();

    void generateTransactionId() {
        long transactionId = System.currentTimeMillis();
        System.out.println("Generated transaction ID: " + transactionId);
    }
}

class CreditCardPayment extends Payment {

    String cardNumber;
    String expiryDate;
    String cvv;

    CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    void processPayment() {
        System.out.println("Processing credit card payment.");
    }

    void validateTransaction() {
        System.out.println("Validating card number, expiry, and CVV.");
    }
}

class UPIPayment extends Payment {

    String upiId;
    String phoneNumber;

    UPIPayment(String upiId, String phoneNumber) {
        this.upiId = upiId;
        this.phoneNumber = phoneNumber;
    }

    void processPayment() {
        System.out.println("Processing UPI payment.");
    }

    void validateTransaction() {
        System.out.println("Validating UPI ID and phone number.");
    }
}

class PayPalPayment extends Payment {

    String email;
    String authToken;

    PayPalPayment(String email, String authToken) {
        this.email = email;
        this.authToken = authToken;
    }

    void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

    void validateTransaction() {
        System.out.println("Validating email and authentication token.");
    }
}

public class Pay {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment(
                "1234567890123456",
                "12/25",
                "123"
        );

        payment.processPayment();
        payment.validateTransaction();
        payment.generateTransactionId();

        System.out.println();

        payment = new UPIPayment(
                "user@upi",
                "9876543210"
        );

        payment.processPayment();
        payment.validateTransaction();
        payment.generateTransactionId();

        System.out.println();

        payment = new PayPalPayment(
                "user@example.com",
                "abc123"
        );

        payment.processPayment();
        payment.validateTransaction();
        payment.generateTransactionId();
    }
}