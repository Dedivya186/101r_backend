package com.day8;

import java.util.Scanner;

public class DigitCount {

	    static void printFrequency(int n) {
	        int[] frequency = new int[10];

	        while (n > 0) {
	            int digit = n % 10;
	            frequency[digit]++;
	            n /= 10;
	        }

	        for (int i = 0; i <= 9; i++) {
	            System.out.println(i + ": " + frequency[i]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        printFrequency(n);
	    }
	

}
