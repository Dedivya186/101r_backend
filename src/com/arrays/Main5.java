package com.arrays;

public class Main5 {

    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -8, 15, -2};

        System.out.print("Positive: ");

        for (int num : arr) {
            if (num > 0)
                System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Negative: ");

        for (int num : arr) {
            if (num < 0)
                System.out.print(num + " ");
        }
    }
}