package com.day16;

import java.util.Scanner;

class ValidPrime {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (isPrime(n) && isPrime(sum)) {
            System.out.println("Valid Prime");
        } else {
            System.out.println("Invalid Prime");
        }
    }
}