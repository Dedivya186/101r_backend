package com.day8;

import java.util.Scanner;

public class CountOfPrime {

	    static boolean isPrimeDigit(int digit) {
	        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
	    }

	    static int countPrimeDigits(int n) {
	        int count = 0;

	        while (n > 0) {
	            int digit = n % 10;

	            if (isPrimeDigit(digit)) {
	                count++;
	            }

	            n /= 10;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(countPrimeDigits(n));
	    }
	}


