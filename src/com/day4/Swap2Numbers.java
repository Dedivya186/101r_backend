package com.day4;

import java.util.Scanner;

public class Swap2Numbers {

	
	    static void swap(int a, int b) {

	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping:");
	        System.out.println(a);
	        System.out.println(b);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        System.out.println("Before swapping:");
	        System.out.println(a);
	        System.out.println(b);

	        swap(a, b);
	    }
	}


