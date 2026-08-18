package com.day9;

import java.util.Scanner;

class Product {
    private String productName;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }
}

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Product: ");
        p.setProductName(sc.nextLine());

        System.out.print("Price: ");
        p.setPrice(sc.nextDouble());

        System.out.println("Product: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
    }
}