package com.day15;

import java.util.ArrayList;

class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getProductTotal() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println(
            productName + " - ₹" + price + " x " + quantity
        );
    }
}

class ShoppingCart {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to cart.");
    }

    public void removeProduct(int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {
                products.remove(product);
                System.out.println(
                    product.getProductName() + " removed from cart."
                );
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getProductTotal();
        }

        return total;
    }

    public void displayCart() {

        System.out.println("----- Shopping Cart -----");

        for (Product product : products) {
            product.displayProduct();
        }

        double total = calculateTotal();
        double discount = 0;

        if (total >= 5000) {
            discount = total * 0.20;
        } else if (total >= 3000) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("-------------------------");
        System.out.println("Cart Total: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}

public class ShoppingCard {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 40000, 1);
        Product p2 = new Product(102, "Mouse", 1000, 1);
        Product p3 = new Product(103, "Keyboard", 2000, 1);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        System.out.println("\nAfter removing Mouse:");

        cart.removeProduct(102);

        cart.displayCart();
    }
}