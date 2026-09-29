package com.arraylist;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> emp=new ArrayList<>();
		emp.add(5002);
		emp.add(5003);
		emp.add(5004);
		emp.add(5005);
		emp.add(5006);
		emp.add(5007);
		emp.add(5008);
		emp.add(5009);
		 // Insert 5001 at index 3
        emp.add(3, 5001);

        // Replace employee ID at index 5
        emp.set(5, 9001);

        // Remove employee ID at index 2
        emp.remove(2);

        // Display employee ID at index 4
        System.out.println("Employee ID at index 4: " + emp.get(4));

        // Print total number of employee IDs
        System.out.println("Total employee IDs: " + emp.size());
        System.out.println("final list: ");
	   System.out.println(emp);
		
		


	}

}
