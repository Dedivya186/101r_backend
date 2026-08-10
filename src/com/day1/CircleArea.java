package com.day1;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int r=sc.nextInt();
	      double pi = 3.142;
	      double area=pi*r*r;
	      System.out.printf("%.4f",area);
	}

}
