package com.day8;

import java.util.Scanner;

public class Harshad {
	    static int sumOfDigits(int n) {
	        int sum = 0;

	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }

	        return sum;
	    }

	    static boolean isHarshad(int n) {
	        int sum = sumOfDigits(n);

	        return n % sum == 0;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        if (isHarshad(n)) {
	            System.out.println("Harshad Number");
	        } else {
	            System.out.println("Not a Harshad Number");
	        }
	    }
	

}
