package com.day8;

import java.util.Scanner;

public class Palindrome {

	    static boolean isPalindrome(int n) {
	        int original = n;
	        int reverse = 0;

	        while (n > 0) {
	            int digit = n % 10;
	            reverse = reverse * 10 + digit;
	            n /= 10;
	        }

	        return original == reverse;
	    }

	    static void printPalindromes(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            if (isPalindrome(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        printPalindromes(start, end);
	    }
	

}
