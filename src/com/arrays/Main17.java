package com.arrays;

public class Main17 {

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {5, 11, 13, 8, 17, 20, 23};

        int sum = 0;

        for (int num : arr) {

            if (num > 10 && isPrime(num)) {
                sum += num;
            }
        }

        System.out.println("Sum = " + sum);
    }
}