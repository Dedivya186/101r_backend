package com.problemsolving;

public class Array {

	
	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30, 20};

	        int[] frequency = new int[51];

	        for (int i = 0; i < arr.length; i++) {
	            frequency[arr[i]]++;
	        }

	        for (int i = 0; i < frequency.length; i++) {

	            if (frequency[i] > 1) {
	                System.out.println(i + "-> " + frequency[i] + " times");
	            }
	        }
	    }
	

}
