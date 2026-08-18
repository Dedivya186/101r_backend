package com.day8;

import java.util.Scanner;

public class Neon {

	    static int sumOfDigits(int n) {
	        int sum = 0;

	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }

	        return sum;
	    }

	    static boolean isNeon(int n) {
	        int square = n * n;
	        return sumOfDigits(square) == n;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        if (isNeon(n)) {
	            System.out.println("Neon Number");
	        } else {
	            System.out.println("Not a Neon Number");
	        }
	    }
	

}
