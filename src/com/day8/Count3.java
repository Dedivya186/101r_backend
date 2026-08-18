package com.day8;

import java.util.Scanner;

public class Count3 {

	    static int countFactors(int n) {
	        int count = 0;

	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                count++;
	            }
	        }

	        return count;
	    }

	    static void printThreeFactorNumbers(int n) {
	        for (int i = 1; i <= n; i++) {
	            if (countFactors(i) == 3) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        printThreeFactorNumbers(n);
	    }
	

}
