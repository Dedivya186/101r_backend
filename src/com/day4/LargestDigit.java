package com.day4;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = Math.abs(n);

        int largest = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                largest = digit;
            }

            n = n / 10;
        }

        System.out.println(largest);
    }

}
