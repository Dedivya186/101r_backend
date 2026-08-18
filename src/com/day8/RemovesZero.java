package com.day8;

import java.util.Scanner;

public class RemovesZero {

	    static int removeZeros(int n) {
	        int result = 0;
	        int place = 1;

	        while (n > 0) {
	            int digit = n % 10;

	            if (digit != 0) {
	                result = digit * place + result;
	                place *= 10;
	            }

	            n /= 10;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(removeZeros(n));
	    }
	
	}


