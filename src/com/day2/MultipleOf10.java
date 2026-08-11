package com.day2;

import java.util.Scanner;

public class MultipleOf10 {

	
	    static void MultiplesOf10(int n) {
	        if (n % 10 == 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        MultiplesOf10(n);
	    }
	}


