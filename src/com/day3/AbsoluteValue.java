package com.day3;

import java.util.Scanner;

public class AbsoluteValue {
	static int absoluteValue(int n) {
        return Math.abs(n);
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(absoluteValue(n));
    }

}
