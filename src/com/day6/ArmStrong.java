package com.day6;

import java.util.Scanner;

public class ArmStrong {
	
	    static int countDigits(int n) {

	        int count = 0;

	        while (n > 0) {
	            count++;
	            n = n / 10;
	        }

	        return count;
	    }

	    static boolean isArmstrong(int n) {

	        int original = n;
	        int digits = countDigits(n);
	        int sum = 0;

	        while (n > 0) {

	            int digit = n % 10;

	            int power = 1;

	            for (int i = 1; i <= digits; i++) {
	                power = power * digit;
	            }

	            sum = sum + power;
	            n = n / 10;
	        }

	        return sum == original;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        if (isArmstrong(n))
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not Armstrong Number");
	    }
	}

