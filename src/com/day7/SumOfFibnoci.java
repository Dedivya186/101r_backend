package com.day7;

import java.util.Scanner;

public class SumOfFibnoci {

	
	    static int fibonacciSum(int n) {
	        int a = 0;
	        int b = 1;
	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            sum += a;

	            int c = a + b;
	            a = b;
	            b = c;
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(fibonacciSum(n));
	    }
	
}
