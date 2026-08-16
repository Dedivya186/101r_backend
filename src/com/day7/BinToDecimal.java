package com.day7;

import java.util.Scanner;

public class BinToDecimal {
	

	    static int binaryToDecimal(int binary) {
	        int decimal = 0;
	        int power = 1;

	        while (binary > 0) {
	            int digit = binary % 10;

	            decimal = decimal + digit * power;

	            power = power * 2;
	            binary = binary / 10;
	        }

	        return decimal;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int binary = sc.nextInt();

	        System.out.println(binaryToDecimal(binary));
	    }
	}


