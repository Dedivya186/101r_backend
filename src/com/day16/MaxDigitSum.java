package com.day16;

import java.util.Scanner;

class MaximumDigitSum {

    static int digitSum(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int maxSum = -1;
        int result = m;

        for (int i = m; i <= n; i++) {

            int sum = digitSum(i);

            if (sum > maxSum) {
                maxSum = sum;
                result = i;
            }
        }

        System.out.println(result);
    }
}