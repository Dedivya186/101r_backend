package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {

	private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        // Add 6 orders
        orders.add(new Order(101, "Laptop", 1, 55000));
        orders.add(new Order(102, "Mouse", 2, 800));
        orders.add(new Order(103, "Keyboard", 1, 1500));
        orders.add(new Order(104, "Monitor", 1, 12000));
        orders.add(new Order(105, "Headphones", 2, 2500));
        orders.add(new Order(106, "Mobile", 1, 30000));

        // Insert new order at index 4
        orders.add(4, new Order(107, "Tablet", 1, 20000));

        // Replace order at index 2
        orders.set(2, new Order(108, "Printer", 1, 9000));

        // Remove last order
        orders.remove(orders.size() - 1);

        // Display order at index 3
        Order o = orders.get(3);

        System.out.println("Order at index 3:");
        System.out.println("Order ID: " + o.getOrderId());
        System.out.println("Product Name: " + o.getProductName());
        System.out.println("Quantity: " + o.getQuantity());
        System.out.println("Price: " + o.getPrice());

        System.out.println();

        // Display all orders using Iterator
        Iterator<Order> itr = orders.iterator();

        while (itr.hasNext()) {

            Order order = itr.next();

            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Product Name: " + order.getProductName());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Price: " + order.getPrice());
            System.out.println();
        }

        // Total number of orders
        System.out.println("Total number of orders: " + orders.size());

        // Clear all orders
        orders.clear();

        // Check whether list is empty
        System.out.println("Is order list empty: " + orders.isEmpty());
    }
}
