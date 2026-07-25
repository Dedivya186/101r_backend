package com.pack;

import java.util.ArrayList;

public class Main {

    /**
     * Returns the number of digits in an integer.
     */
    public static int count_digits(int n) {
        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    /**
     * Returns the Fibonacci series up to the nth term.
     */
    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            list.add(first);
            int next = first + second;
            first = second;
            second = next;
        }

        return list;
    }

    /**
     * Returns all prime numbers in the given range.
     */
    public static ArrayList<Integer> prime_numbers(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {

            if (i < 2) {
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        return primes;
    }

    /**
     * Returns all factors of a number.
     */
    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> factorList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }
        }

        return factorList;
    }

    /**
     * Returns the Greatest Common Divisor (GCD).
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * Returns the Least Common Multiple (LCM).
     */
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Example use cases.
     */
    public static void main(String[] args) {

        System.out.println("Digit Count of 12345: " + count_digits(12345));

        System.out.println("Fibonacci Series (10 terms):");
        System.out.println(fibonacci(10));

        System.out.println("Prime Numbers from 10 to 50:");
        System.out.println(prime_numbers(10, 50));

        System.out.println("Factors of 24:");
        System.out.println(factors(24));

        System.out.println("GCD of 24 and 36: " + gcd(24, 36));

        System.out.println("LCM of 24 and 36: " + lcm(24, 36));
    }
}