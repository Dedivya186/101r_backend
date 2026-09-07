package com.arrays;

public class Main2 {

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

        int[] arr = {5, 10, 15, 7, 25, 5, 11};

        int count = 0;

        for (int num : arr) {

            if (isPrime(num) && num % 5 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}