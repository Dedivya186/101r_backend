package com.day2;

import java.util.Scanner;

public class TwoDigit {
	
	    static void checkTwoDigit(int n) {
	        n = Math.abs(n);

	        if (n >= 10 && n <= 99)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        checkTwoDigit(n);
	    }
	}
