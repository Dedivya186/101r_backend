package com.day1;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     double fahrenheit =sc.nextDouble();
	  double   celsius = (fahrenheit-32)*5/9;
	   System.out.printf("%.4f",celsius);
	}

}
