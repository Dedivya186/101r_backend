package com.day3;

import java.util.Scanner;

public class isNumberOrNot {

	

	    static boolean isNumeric(int n) {
	        return Character.isDigit((char) n);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println(isNumeric(n) ? "Yes" : "No");
	    }
	}


