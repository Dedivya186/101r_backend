package com.overriding;

class FoodDelivery {

    void calculateDeliveryCharge(double distance) {
        System.out.println("Delivery charge calculation");
    }

    void calculateDiscount(double amount) {
        System.out.println("Discount calculation");
    }

    void estimateDeliveryTime() {
        System.out.println("Delivery time estimation");
    }

    void displayOrderStatus() {
        System.out.println("Order status");
    }
}


// Swiggy Delivery
class SwiggyDelivery extends FoodDelivery {

    @Override
    void calculateDeliveryCharge(double distance) {
        double charge = distance * 5;
        System.out.println("Swiggy Delivery Charge: ₹" + charge);
    }

    @Override
    void calculateDiscount(double amount) {
        double discount = amount * 0.20;
        System.out.println("Swiggy Discount: ₹" + discount);
    }

    @Override
    void estimateDeliveryTime() {
        System.out.println("Swiggy: Delivery within 30 minutes");
    }

    @Override
    void displayOrderStatus() {
        System.out.println("Swiggy: Order is out for delivery");
    }
}


// Zomato Delivery
class ZomatoDelivery extends FoodDelivery {

    @Override
    void calculateDeliveryCharge(double distance) {
        double charge = distance * 6;
        System.out.println("Zomato Delivery Charge: ₹" + charge);
    }

    @Override
    void calculateDiscount(double amount) {
        double discount = amount * 0.15;
        System.out.println("Zomato Discount: ₹" + discount);
    }

    @Override
    void estimateDeliveryTime() {
        System.out.println("Zomato: Delivery within 35 minutes");
    }

    @Override
    void displayOrderStatus() {
        System.out.println("Zomato: Restaurant is preparing your order");
    }
}


// Restaurant Delivery
class RestaurantDelivery extends FoodDelivery {

    @Override
    void calculateDeliveryCharge(double distance) {
        double charge = distance * 4;
        System.out.println("Restaurant Delivery Charge: ₹" + charge);
    }

    @Override
    void calculateDiscount(double amount) {
        double discount = amount * 0.10;
        System.out.println("Restaurant Discount: ₹" + discount);
    }

    @Override
    void estimateDeliveryTime() {
        System.out.println("Restaurant: Delivery within 45 minutes");
    }

    @Override
    void displayOrderStatus() {
        System.out.println("Restaurant: Order is being prepared");
    }
}


// Main
public class Delivery {

    public static void main(String[] args) {

        SwiggyDelivery swiggy = new SwiggyDelivery();

        swiggy.calculateDeliveryCharge(10);
        swiggy.calculateDiscount(1000);
        swiggy.estimateDeliveryTime();
        swiggy.displayOrderStatus();

        System.out.println();

        ZomatoDelivery zomato = new ZomatoDelivery();

        zomato.calculateDeliveryCharge(10);
        zomato.calculateDiscount(1000);
        zomato.estimateDeliveryTime();
        zomato.displayOrderStatus();

        System.out.println();

        RestaurantDelivery restaurant = new RestaurantDelivery();

        restaurant.calculateDeliveryCharge(10);
        restaurant.calculateDiscount(1000);
        restaurant.estimateDeliveryTime();
        restaurant.displayOrderStatus();
    }
}