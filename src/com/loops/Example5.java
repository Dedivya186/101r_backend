package com.loops;

public class Example5 {
	
	    public static boolean isSpyNumber(int num) {
	        int sum = 0;
	        int product = 1;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit;
	            product *= digit;
	            num /= 10;
	        }

	        return sum == product;
	    }

	    public static void main(String[] args) {

	        int num = 123;

	        if (isSpyNumber(num)) {
	            System.out.println(num + " is a Spy Number.");
	        } else {
	            System.out.println(num + " is not a Spy Number.");
	        }
	    }
	
}
