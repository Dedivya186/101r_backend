package com.problemsolv;

import java.util.ArrayList;

public class Example7 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(70);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            if (!list2.contains(list1.get(i))) {
                result.add(list1.get(i));
            }
        }

        System.out.println(result);
    }
}