package com.day13;

abstract class Order {
    double productPrice;

    Order(double productPrice) {
        this.productPrice = productPrice;
    }

    abstract double calculateDeliveryCharge();

    abstract double calculateFinalAmount();
}

class RegularOrder extends Order {

    RegularOrder(double productPrice) {
        super(productPrice);
    }

    double calculateDeliveryCharge() {
        return 50;
    }

    double calculateFinalAmount() {
        return productPrice + calculateDeliveryCharge();
    }
}

class ExpressOrder extends Order {

    ExpressOrder(double productPrice) {
        super(productPrice);
    }

    double calculateDeliveryCharge() {
        return 100;
    }

    double calculateFinalAmount() {
        return productPrice + calculateDeliveryCharge();
    }
}

public class OrderSystem {
    public static void main(String[] args) {

        Order regular = new RegularOrder(1000);
        Order express = new ExpressOrder(1000);

        System.out.println(
            "Regular Order Final Amount: " + regular.calculateFinalAmount()
        );

        System.out.println(
            "Express Order Final Amount: " + express.calculateFinalAmount()
        );
    }
}