package com.day7;

import java.util.Scanner;

public class DecimalToBin {

	
	    static long decimalToBinary(int n) {
	        long binary = 0;
	        long place = 1;

	        while (n > 0) {
	            int remainder = n % 2;

	            binary = binary + remainder * place;

	            place = place * 10;
	            n = n / 2;
	        }

	        return binary;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(decimalToBinary(n));
	    }
	

}
