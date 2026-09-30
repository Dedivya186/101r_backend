package com.problemsolv;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30, 20};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (list.contains(arr[i])) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " → " + count + " times");
            }

            list.add(arr[i]);
        }
    }
}