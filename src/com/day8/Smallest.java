package com.day8;

import java.util.Scanner;

public class Smallest {

	    static int countFactors(int n) {
	        int count = 0;

	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                count++;
	            }
	        }

	        return count;
	    }

	    static int smallestNumber(int n) {
	        int number = 1;

	        while (true) {
	            if (countFactors(number) == n) {
	                return number;
	            }

	            number++;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(smallestNumber(n));
	    }
	
}
