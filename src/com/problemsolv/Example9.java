package com.problemsolv;

import java.util.ArrayList;

public class Example9 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30, 50};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}