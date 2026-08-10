package com.day1;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int r=sc.nextInt();
	      double pi = 3.142;
	     double h=sc.nextDouble();
		double area=2 * pi * r*(r+h);
		System.out.printf("%.4f",area);
	}

}
