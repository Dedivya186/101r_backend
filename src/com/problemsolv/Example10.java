package com.problemsolv;

import java.util.ArrayList;

public class Example10 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(50);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }

        System.out.println(result);
    }
}