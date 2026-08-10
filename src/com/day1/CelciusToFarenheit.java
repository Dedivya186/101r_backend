package com.day1;

import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     double celsius=sc.nextInt();
	  double   fahrenheit = (celsius*9/5)+32;
	   System.out.println(fahrenheit);
	}

}
