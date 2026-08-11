package com.day2;
import java.util.*;
public class EvenOrOdd {

	    static void checkEvenOdd(int n) {
	        if (n % 2 == 0)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        checkEvenOdd(n);
	    }
	}
