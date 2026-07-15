package com.loops;
import java.util.*;
public class Example7 {
	    public static boolean isDuckNumber(int num) {
	        while (num > 0) {
	            int digit = num % 10;

	            if (digit == 0) {
	                return true;
	            }

	            num = num / 10;
	        }

	        return false;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a Number: ");
	        int num = sc.nextInt();

	        if (isDuckNumber(num)) {
	            System.out.println(num + " is a Duck Number.");
	        } else {
	            System.out.println(num + " is not a Duck Number.");
	        }
	    }
}
