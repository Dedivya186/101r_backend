package com.interfaces;

interface FoodService {

    void takeOrder();

    void prepareFood();

    void generateBill();
}

class Restaurant implements FoodService {

    String customerName;
    String foodItem;

    Restaurant(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("Restaurant: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("Restaurant: Preparing food using chef");
    }

    public void generateBill() {
        double bill = 250;
        System.out.println("Restaurant Bill: ₹" + bill);
    }
}

class Cafeteria implements FoodService {

    String customerName;
    String foodItem;

    Cafeteria(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("Cafeteria: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("Cafeteria: Preparing food quickly");
    }

    public void generateBill() {
        double bill = 150;
        System.out.println("Cafeteria Bill: ₹" + bill);
    }
}

class FoodCourt implements FoodService {

    String customerName;
    String foodItem;

    FoodCourt(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    public void takeOrder() {
        System.out.println("FoodCourt: Order taken for " + customerName);
        System.out.println("Food Item: " + foodItem);
    }

    public void prepareFood() {
        System.out.println("FoodCourt: Preparing food at the food counter");
    }

    public void generateBill() {
        double bill = 200;
        System.out.println("FoodCourt Bill: ₹" + bill);
    }
}

public class ResturantOrders {

    public static void main(String[] args) {

        FoodService food;

        food = new Restaurant("Sumanjali", "Biryani");
        food.takeOrder();
        food.prepareFood();
        food.generateBill();

        System.out.println();

        food = new Cafeteria("Rahul", "Dosa");
        food.takeOrder();
        food.prepareFood();
        food.generateBill();

        System.out.println();

        food = new FoodCourt("Priya", "Pizza");
        food.takeOrder();
        food.prepareFood();
        food.generateBill();
    }
}