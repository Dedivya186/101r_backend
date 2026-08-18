package com.day8;

import java.util.Scanner;

public class SecondLargest {
	    static int secondLargestDigit(int n) {
	        int largest = -1;
	        int secondLargest = -1;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit > largest) {
	                secondLargest = largest;
	                largest = digit;
	            } 
	            else if (digit > secondLargest && digit != largest) {
	                secondLargest = digit;
	            }

	            n /= 10;
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(secondLargestDigit(n));
	    }
	

}
