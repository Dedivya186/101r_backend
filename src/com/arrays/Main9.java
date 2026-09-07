package com.arrays;

public class Main9 {

    public static void main(String[] args) {

        int[] arr = {10, 12, 15, 22, 25, 31, 40};

        for (int num : arr) {

            if (num % 5 == 0)
                System.out.print(num + " ");
        }
    }
}