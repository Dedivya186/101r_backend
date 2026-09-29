package com.arraylist;

import java.util.ArrayList;

public class Customer {
  int customerId;
  String customerName;
  String city;
  long phoneNumber;
	public Customer(int customerId, String customerName, String city, long l) {
	this.customerId = customerId;
	this.customerName = customerName;
	this.city = city;
	this.phoneNumber = l;
   }
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();

        // Add 5 customers
        customers.add(new Customer(101, "Ravi", "Hyderabad", 9876543210L));
        customers.add(new Customer(102, "Sita", "Chennai", 9876543211L));
        customers.add(new Customer(103, "Kiran", "Bangalore", 9876543212L));
        customers.add(new Customer(104, "Anu", "Mumbai", 9876543213L));
        customers.add(new Customer(105, "Rahul", "Delhi", 9876543214L));
      
        
        // Insert new customer at index 2
        customers.add(2, new Customer(106, "Priya", "Pune", 9876543215L));

        // Replace customer at index 3
        customers.set(3, new Customer(107, "Arun", "Kolkata", 9876543216L));

        // Remove customer at index 1
        customers.remove(1);

        // Display all customer details
        for (int i = 0; i < customers.size(); i++) {

            Customer c = customers.get(i);

            System.out.println("Customer ID: " + c.getCustomerId());
            System.out.println("Customer Name: " + c.getCustomerName());
            System.out.println("City: " + c.getCity());
            System.out.println("Phone Number: " + c.getPhoneNumber());
            System.out.println();
        }

        // Total number of customers
        System.out.println("Total customers: " + customers.size());

        // Clear the list
        customers.clear();

        // Check whether list is empty
        System.out.println("Is list empty: " + customers.isEmpty());
		

	}

}
