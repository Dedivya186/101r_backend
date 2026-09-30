package com.problemsolv;

import java.util.ArrayList;

public class Example5 {
    public static void main(String[] args) {

        int[] arr = {0, 10, 0, 20, 30, 0, 40};

        ArrayList<Integer> list = new ArrayList<>();

        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                list.add(arr[i]);
            } else {
                zero++;
            }
        }

        for (int i = 0; i < zero; i++) {
            list.add(0);
        }

        System.out.println(list);
    }
}
