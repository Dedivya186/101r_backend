package com.arrays;

public class Main14{

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int search = 30;

        boolean found = false;

        for (int num : arr) {

            if (num == search) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}