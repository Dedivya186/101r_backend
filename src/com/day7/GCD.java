package com.day7;

import java.util.Scanner;

public class GCD {


	    static int gcd(int a, int b) {
	        while (b != 0) {
	            int remainder = a % b;
	            a = b;
	            b = remainder;
	        }

	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        System.out.println(gcd(a, b));
	    }
	

}
