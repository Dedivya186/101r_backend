package com.day2;

import java.util.Scanner;

public class MultipleOf5And3 {

	
	    static void checkMultiple(int n) {
	        if (n % 5 == 0 && n % 3 == 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        checkMultiple(n);
	    }
	}


