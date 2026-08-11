package com.day2;

import java.util.Scanner;

public class MultipleOf5 {

	
	    static void MultiplesOf5(int n) {
	        if (n % 5 == 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        MultiplesOf5(n);
	    }
	}


