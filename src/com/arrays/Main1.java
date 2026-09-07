package com.arrays;

public class Main1 {

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

        int[] arr = {10, 3, 7, 8, 11, 15, 17};

        for (int num : arr) {

            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}