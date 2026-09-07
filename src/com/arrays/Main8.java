package com.arrays;

public class Main8 {

    public static void main(String[] args) {

        int[] arr = {5, 15, 20, 8, 25, 3};

        int count = 0;

        for (int num : arr) {

            if (num < 10)
                count++;
        }

        System.out.println("Count = " + count);
    }
}