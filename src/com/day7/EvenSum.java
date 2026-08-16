package com.day7;

import java.util.Scanner;

public class EvenSum {
	
	    static int sumEven(int start, int end) {
	        int sum = 0;

	        for (int i = start; i <= end; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        System.out.println(sumEven(start, end));
	    }
	}


