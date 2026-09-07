package com.arrays;

public class Main4 {

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {

            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}