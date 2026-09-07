package com.day17;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


class Customer extends User {

    private String customerType;

    Customer(String name, String mobileNumber,
             String email, String customerType) {

        super(name, mobileNumber, email);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double calculateDiscount(double orderAmount) {

        if (customerType.equalsIgnoreCase("Premium Customer")) {
            return orderAmount * 10 / 100;
        } else {
            return orderAmount * 5 / 100;
        }
    }
}


class DeliveryPartner extends User {

    private String vehicleNumber;

    DeliveryPartner(String name, String mobileNumber,
                    String email, String vehicleNumber) {

        super(name, mobileNumber, email);
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}


class Restaurant {

    private String restaurantName;
    private String location;
    private double rating;

    Restaurant(String restaurantName, String location, double rating) {

        this.restaurantName = restaurantName;
        this.location = location;
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}


abstract class Payment {

    public abstract String makePayment();
}


class UPI extends Payment {

    @Override
    public String makePayment() {
        return "Payment Successful";
    }
}


class CreditCard extends Payment {

    @Override
    public String makePayment() {
        return "Payment Successful";
    }
}


class CashOnDelivery extends Payment {

    @Override
    public String makePayment() {
        return "Payment Pending - Cash on Delivery";
    }
}


class Order {

    private int orderId;
    private Customer customer;
    private Restaurant restaurant;
    private double orderAmount;

    Order(int orderId, Customer customer,
          Restaurant restaurant, double orderAmount) {

        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderAmount = orderAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void displayOrder(double deliveryCharge,
                             String paymentMethod,
                             String paymentStatus) {

        double discount =
                customer.calculateDiscount(orderAmount);

        double finalAmount =
                orderAmount - discount + deliveryCharge;

        System.out.println();
        System.out.println("========== FOOD DELIVERY ORDER ==========");

        System.out.println("Order ID        : " + orderId);

        System.out.println("----- Customer Details -----");

        System.out.println("Name            : "
                + customer.getName());

        System.out.println("Mobile Number   : "
                + customer.getMobileNumber());

        System.out.println("Email           : "
                + customer.getEmail());

        System.out.println("Customer Type   : "
                + customer.getCustomerType());


        System.out.println("----- Restaurant Details -----");

        System.out.println("Restaurant      : "
                + restaurant.getRestaurantName());

        System.out.println("Location        : "
                + restaurant.getLocation());

        System.out.println("Rating          : "
                + restaurant.getRating());


        System.out.println("----- Payment Details -----");

        System.out.println("Payment Method  : "
                + paymentMethod);

        System.out.println("Payment Status  : "
                + paymentStatus);


        System.out.println("----- Bill Details -----");

        System.out.println("Order Amount    : ₹"
                + orderAmount);

        System.out.println("Discount        : ₹"
                + discount);

        System.out.println("Delivery Charge : ₹"
                + deliveryCharge);

        System.out.println("--------------------------------");

        System.out.println("Final Amount    : ₹"
                + finalAmount);

        System.out.println("==========================================");

        System.out.println("Order placed successfully!");
    }
}


public class FoodDeliveryApplicatio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Restaurant Name: ");
        String restaurantName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();



        System.out.print("Enter Order ID: ");
        int orderId = sc.nextInt();

        System.out.print("Enter Order Amount: ");
        double orderAmount = sc.nextDouble();



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



        Customer customer =
                new Customer(
                        name,
                        mobileNumber,
                        email,
                        customerType
                );



        Restaurant restaurant =
                new Restaurant(
                        restaurantName,
                        location,
                        rating
                );



        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Cash On Delivery");

        System.out.print("Enter Choice: ");
        int paymentChoice = sc.nextInt();


        Payment payment;

        String paymentMethod;


        if (paymentChoice == 1) {

            payment = new UPI();
            paymentMethod = "UPI";

        } else if (paymentChoice == 2) {

            payment = new CreditCard();
            paymentMethod = "Credit Card";

        } else {

            payment = new CashOnDelivery();
            paymentMethod = "Cash On Delivery";
        }



        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();



        Order order =
                new Order(
                        orderId,
                        customer,
                        restaurant,
                        orderAmount
                );



        String paymentStatus =
                payment.makePayment();



        order.displayOrder(
                deliveryCharge,
                paymentMethod,
                paymentStatus
        );


        sc.close();
    }
}

