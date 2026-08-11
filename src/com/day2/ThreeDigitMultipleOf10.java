package com.day2;

import java.util.Scanner;

public class ThreeDigitMultipleOf10 {
	
	    static void checkNumber(int n) {
	        n = Math.abs(n);

	        if (n >= 100 && n <= 999 && n % 10 == 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        checkNumber(n);
	    }
	}

