package com.day7;

import java.util.Scanner;

public class SumOfNumbers {

	

	    static int sumRange(int start, int end) {
	        int sum = 0;

	        for (int i = start; i <= end; i++) {
	            sum += i;
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int start = sc.nextInt();
	        int end = sc.nextInt();

	        System.out.println(sumRange(start, end));
	    }
	}


