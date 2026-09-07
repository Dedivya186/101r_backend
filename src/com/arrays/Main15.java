package com.arrays;

public class Main15 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        int search = 20;

        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                lastIndex = i;
            }
        }

        System.out.println("Last occurrence = " + lastIndex);
    }
}