package com.arraylist;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		 ArrayList<Character> ch = new ArrayList<>();

	        // Add A to F
	        ch.add('A');
	        ch.add('B');
	        ch.add('C');
	        ch.add('D');
	        ch.add('E');
	        ch.add('F');

	        // Insert Z at index 2
	        ch.add(2, 'Z');

	        // Replace character at index 4 with X
	        ch.set(4, 'X');

	        // Remove the first character
	        ch.remove(0);

	        // Display character at index 3
	        System.out.println("Character at index 3: " + ch.get(3));

	        // Print size
	        System.out.println("Size: " + ch.size());

	        // Clear the list
	        ch.clear();

	        // Check whether list is empty
	        System.out.println("Is list empty: " + ch.isEmpty());

	}

}
