package com.day10;

import java.util.Scanner;

class Product {
    String productName;
    double price;
}

class ElectronicProduct extends Product {
    int warranty;

    void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " Years");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectronicProduct e = new ElectronicProduct();

        System.out.print("Product: ");
        e.productName = sc.nextLine();

        System.out.print("Price: ");
        e.price = sc.nextDouble();

        System.out.print("Warranty: ");
        e.warranty = sc.nextInt();

        e.displayProduct();
    }
}