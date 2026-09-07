package com.arrays;

public class Main6 {

    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 20, -8, 0};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {

            if (num > 0)
                positive++;

            else if (num < 0)
                negative++;

            else
                zero++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}