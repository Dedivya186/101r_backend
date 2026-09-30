package com.problemsolv;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        int[] arr = {45, 78, 23, 90, 67, 90, 56, 78};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > largest) {
                second = largest;
                largest = list.get(i);
            }
            else if (list.get(i) > second) {
                second = list.get(i);
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }
}