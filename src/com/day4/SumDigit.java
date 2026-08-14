package com.day4;

import java.util.Scanner;

public class SumDigit {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        n = Math.abs(n);

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println(sum);
    }

}
