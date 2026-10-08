package com.list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();

	        // Add elements to the list
	        list.add(15);
	        list.add(25);
	        list.add(35);
	        list.add(45);
	        list.add(55);
	        list.add(65);

	        // Display the original list
	        System.out.println("Original List: " + list);

	        // Find sublist from index 2 to 5
	        // Index 2 is included and index 5 is excluded
//	        List<Integer> sublist = list.subList(2, 5);

	        // Display the sublist
	        System.out.println("Sublist: " + list.subList(2, 5));

	}

}
