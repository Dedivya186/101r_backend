package com.arrays;

public class Main13 {

	public static void main(String[] args) {
		 int[] arr = {10, 12, -15, 0, 25, 0, 40};

	       int positive=0;
	    		   int negative=0;
	    		   int zero=0;
	        for (int num : arr) {
		if (num > 0)
		    positive++;
		else if (num < 0)
		    negative++;
		else
		    zero++;
	        }
	        System.out.println("No of positive number:"+positive);
	        System.out.println("No of negative number:"+negative);
	        System.out.println("No of zeros:"+zero);

	}

}
