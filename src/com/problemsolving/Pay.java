package com.problemsolving;

class Payment {
    private int paymentId;
    protected double amount;

    Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Processing Payment");
    }

    public void refund() {
        System.out.println("Payment Refunded");
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID : " + paymentId);
        System.out.println("Amount     : " + amount);
    }
}

class UPIPayment extends Payment {

    UPIPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment through UPI");
        System.out.println("Payment Successful");
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment through Credit Card");
        System.out.println("Payment Successful");
    }
}

class DebitCardPayment extends Payment {

    DebitCardPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment through Debit Card");
        System.out.println("Payment Successful");
    }
}

class NetBankingPayment extends Payment {

    NetBankingPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment through Net Banking");
        System.out.println("Payment Successful");
    }
}

public class Pay {
    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment(101, 2500);
        p.displayPaymentDetails();
        p.pay();

        System.out.println();

        p = new CreditCardPayment(102, 5000);
        p.displayPaymentDetails();
        p.pay();

        System.out.println();

        p = new DebitCardPayment(103, 3000);
        p.displayPaymentDetails();
        p.pay();

        System.out.println();

        p = new NetBankingPayment(104, 7000);
        p.displayPaymentDetails();
        p.pay();
    }
}