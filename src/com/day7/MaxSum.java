package com.day7;

import java.util.Scanner;

public class MaxSum {
	    static int digitSum(int n) {
	        int sum = 0;

	        while (n != 0) {
	            sum += n % 10;
	            n = n / 10;
	        }

	        return sum;
	    }

	    static int maxDigitSumNumber(int[] arr) {
	        int maxNumber = arr[0];
	        int maxSum = digitSum(arr[0]);

	        for (int i = 1; i < arr.length; i++) {
	            int currentSum = digitSum(arr[i]);

	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                maxNumber = arr[i];
	            }
	        }

	        return maxNumber;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println(maxDigitSumNumber(arr));
	    }
	

}
