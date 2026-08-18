package com.problemsolving;

class Product {
    private int productId;
    private String productName;
    protected double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateDiscount() {
        return 0;
    }

    public double calculateFinalPrice() {
        double total = price * quantity;
        return total - calculateDiscount();
    }

    public void displayProduct() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + calculateDiscount());
        System.out.println("Final Price  : " + calculateFinalPrice());
    }
}

class Electronics extends Product {

    Electronics(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15;
    }
}

class Clothing extends Product {

    Clothing(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {

    Grocery(int productId, String productName, double price, int quantity) {
        super(productId, productName, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class Main {
    public static void main(String[] args) {

    	Product p1 = new Electronics(101, "Laptop", 50000, 1);
    	Product p2 = new Clothing(102, "Shirt", 2000, 2);
    	Product p3 = new Grocery(103, "Rice", 1000, 3);

    	double totalBill = 0;

    	p1.displayProduct();
    	totalBill += p1.calculateFinalPrice();

    	System.out.println();

    	p2.displayProduct();
    	totalBill += p2.calculateFinalPrice();

    	System.out.println();

    	p3.displayProduct();
    	totalBill += p3.calculateFinalPrice();

    	System.out.println();

    	System.out.println("Total Shopping Bill : " + totalBill);
    }
}