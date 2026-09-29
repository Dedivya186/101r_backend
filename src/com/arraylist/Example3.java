package com.arraylist;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Double> price = new ArrayList<>();

        // Add 6 product prices
        price.add(100.50);
        price.add(250.75);
        price.add(350.25);
        price.add(499.99);
        price.add(150.50);
        price.add(999.99);

        // Insert a new price at index 1
        price.add(1, 200.00);

        // Replace the last price
        price.set(price.size() - 1, 799.99);
    

        // Remove the third price
        price.remove(2);

        // Display price at index 2
        System.out.println("Price at index 2: " + price.get(2));

        // Print total number of prices
        System.out.println("Total prices: " + price.size());

        // Display final price list
        System.out.println("Final price list: " + price);

	}

}
