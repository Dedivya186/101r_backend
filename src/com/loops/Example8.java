package com.loops;
import java.util.*;
public class Example8 {
	
	
	    public static boolean isAutomorphic(int num) {
	        int square = num * num;
	        int temp = num;
	        while (temp > 0) {
	            if (temp % 10 != square % 10) {
	                return false;
	            }
	            temp = temp / 10;
	            square = square / 10;
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Number: ");
	        int num = sc.nextInt();
	        if (isAutomorphic(num)) {
	            System.out.println(num + " is an Automorphic Number");
	        } else {
	            System.out.println(num + " is not an Automorphic Number");
	        }
	    }
	

}
