package com.arrays;

public class Main16 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40};

        int search = 10;

        int count = 0;

        for (int num : arr) {

            if (num == search)
                count++;
        }

        System.out.println("Occurrences = " + count);
    }
}