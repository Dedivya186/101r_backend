package com.day3;

import java.util.Scanner;

public class MulAndAdd {

	static int calculate(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return a * b;
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculate(a, b));
    }

}
