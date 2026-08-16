package com.day7;

import java.util.Scanner;

public class PrimeNubers {

	    static boolean isPrime(int n) {
	        if (n < 2) {
	            return false;
	        }

	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    static void printPrimes(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        printPrimes(start, end);
	    }
	
}
