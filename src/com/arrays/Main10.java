package com.arrays;

public class Main10 {

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 22, 25, 31, 40};

        int sum = 0;

        for (int num : arr) {

            if (num % 5 == 0)
                sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}