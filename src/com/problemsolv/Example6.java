package com.problemsolv;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {

        int[] arr = {-5, 10, 0, -20, 30, 0, 15, -8};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive.add(arr[i]);
            }
            else if (arr[i] < 0) {
                negative.add(arr[i]);
            }
            else {
                zero.add(arr[i]);
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
