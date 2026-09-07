package com.arrays;

public class Main3 {

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

        int[] arr = {5, 11, 17, 23, 7, 31, 50, 47, 53};

        for (int num : arr) {

            if (num >= 10 && num <= 50 && isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}