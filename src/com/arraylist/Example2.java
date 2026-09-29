package com.arraylist;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {	
		ArrayList<String> shop=new ArrayList<>();
		shop.add("Milk");
        shop.add("Oil");
        shop.add("Sugar");
        shop.add("Soap");
        shop.add("Rice");
        shop.add("Bread");
        shop.add("Eggs");

        System.out.println("Milk present: " + shop.contains("Milk"));

        shop.add(2, "Butter");

        int index = shop.indexOf("Sugar");
        shop.set(index, "Brown Sugar");

        shop.remove("Soap");

        System.out.println("Updated shopping cart: " + shop);

        System.out.println("Total number of items: " + shop.size());

	}

}
