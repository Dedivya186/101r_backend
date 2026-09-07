package com.day18;

import java.util.Scanner;

class User {

    private String name;
    private String mobileNumber;
    private String email;

    User(String name, String mobileNumber, String email) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }
}

class Customer extends User {

    private String customerType;

    Customer(String name, String mobileNumber, String email,
             String customerType) {

        super(name, mobileNumber, email);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getDiscountPercentage() {

        if (customerType.equalsIgnoreCase("Premium Customer")) {
            return 10;
        }

        return 5;
    }
}

class Seller extends User {

    Seller(String name, String mobileNumber, String email) {
        super(name, mobileNumber, email);
    }

    public void displaySellerDetails() {

        System.out.println("Seller Name    : " + getName());
        System.out.println("Mobile Number  : " + getMobileNumber());
        System.out.println("Email          : " + getEmail());
    }
}

class Product {

    private String productName;
    private double price;
    private int quantity;
    private String category;

    Product(String productName, double price,
            int quantity, String category) {

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

abstract class Payment {

    abstract void makePayment();

    abstract String getPaymentMethod();
}

class UPI extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment Successful");
    }

    @Override
    String getPaymentMethod() {
        return "UPI";
    }
}

class CreditCard extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment Successful");
    }

    @Override
    String getPaymentMethod() {
        return "Credit Card";
    }
}

class DebitCard extends Payment {

    @Override
    void makePayment() {
        System.out.println("Payment Successful");
    }

    @Override
    String getPaymentMethod() {
        return "Debit Card";
    }
}

class Order {

    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private double deliveryCharge;

    Order(int orderId, Customer customer,
          Product product, int quantity,
          double deliveryCharge) {

        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.deliveryCharge = deliveryCharge;
    }

    public double calculateSubtotal() {

        return product.getPrice() * quantity;
    }

    public double calculateDiscount() {

        double subtotal = calculateSubtotal();

        double discountPercentage =
                customer.getDiscountPercentage();

        return subtotal * discountPercentage / 100;
    }

    public double calculateFinalAmount() {

        return calculateSubtotal()
                - calculateDiscount()
                + deliveryCharge;
    }

    public void displayOrder(Payment payment) {

        System.out.println();
        System.out.println("========== ONLINE SHOPPING ORDER ==========");
        System.out.println("Order ID        : " + orderId);

        System.out.println("----- Customer Details -----");
        System.out.println("Name            : " + customer.getName());
        System.out.println("Mobile Number   : " + customer.getMobileNumber());
        System.out.println("Email           : " + customer.getEmail());
        System.out.println("Customer Type   : "
                + customer.getCustomerType());

        System.out.println("----- Product Details -----");
        System.out.println("Product         : "
                + product.getProductName());
        System.out.println("Category        : "
                + product.getCategory());
        System.out.println("Price           : ₹"
                + product.getPrice());
        System.out.println("Quantity        : " + quantity);

        System.out.println("----- Payment Details -----");
        System.out.println("Payment Method  : "
                + payment.getPaymentMethod());
        System.out.println("Payment Status  : Payment Successful");

        System.out.println("----- Bill Details -----");

        System.out.println("Subtotal        : ₹"
                + calculateSubtotal());

        System.out.println("Discount        : ₹"
                + calculateDiscount());

        System.out.println("Delivery Charge : ₹"
                + deliveryCharge);

        System.out.println("--------------------------------");

        System.out.println("Final Amount    : ₹"
                + calculateFinalAmount());

        System.out.println("============================================");
        System.out.println("Order placed successfully!");
    }
}

public class OnlineShoppingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Product details
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int productQuantity = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        // Order ID
        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();

        // Customer type
        System.out.println("Select Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Premium Customer");

        System.out.print("Enter Choice: ");
        int customerChoice = sc.nextInt();

        String customerType;

        if (customerChoice == 2) {
            customerType = "Premium Customer";
        } else {
            customerType = "Regular Customer";
        }

        // Create Customer object
        Customer customer =
                new Customer(
                        name,
                        mobileNumber,
                        email,
                        customerType
                );

        // Create Product object
        Product product =
                new Product(
                        productName,
                        price,
                        productQuantity,
                        category
                );

        // Payment selection
        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        System.out.print("Enter Choice: ");
        int paymentChoice = sc.nextInt();

        Payment payment;

        if (paymentChoice == 1) {

            payment = new UPI();

        } else if (paymentChoice == 2) {

            payment = new CreditCard();

        } else {

            payment = new DebitCard();
        }

        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();

        payment.makePayment();

        Order order =
                new Order(
                        orderId,
                        customer,
                        product,
                        productQuantity,
                        deliveryCharge
                );

        order.displayOrder(payment);

        sc.close();
    }
}

