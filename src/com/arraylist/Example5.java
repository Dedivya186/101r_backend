package com.arraylist;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

        // Add 10 numbers
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        num.add(80);
        num.add(90);
        num.add(100);

        // Insert 100 at index 5
        num.add(5, 100);

        // Replace element at index 2 with 500
        num.set(2, 500);

        // Remove element at index 7
        num.remove(7);

        // Check whether 500 is present
        System.out.println("500 is present: " + num.contains(500));

        // Display element at index 4
        System.out.println("Element at index 4: " + num.get(4));

        // Print total number of elements
        System.out.println("Total elements: " + num.size());

        // Clear the list
        num.clear();

        // Check whether list is empty
        System.out.println("Is list empty: " + num.isEmpty());

	}

}
