package com.arrays;

public class Main19 {

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

        int[] arr = {10, 17, 23, 5, 31, 15, 19};

        int smallestPrime = -1;

        for (int num : arr) {

            if (isPrime(num)) {

                if (smallestPrime == -1 || num < smallestPrime) {
                    smallestPrime = num;
                }
            }
        }

        System.out.println("Smallest prime = " + smallestPrime);
    }
}