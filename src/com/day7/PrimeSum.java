package com.day7;

import java.util.Scanner;

public class PrimeSum {
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

	    static int sumPrimes(int n) {
	        int sum = 0;

	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(sumPrimes(n));
	    }
	}


