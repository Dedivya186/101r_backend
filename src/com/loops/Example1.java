package com.loops;

public class Example1 {
		    public static boolean isNeon(int num) {
		        int square = num * num;
		        int sum = 0;

		        while (square > 0) {
		            int rem = square % 10;
		            sum = sum + rem;
		            square = square / 10;
		        }

		        return sum == num;
		    }

		    public static void main(String[] args) {
		       
		        if (isNeon(9)) {
		            System.out.println(" a Neon Number.");
		        } else {
		            System.out.println("  not a Neon Number.");
		        }
		    }
}
