package com.problemsolv;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);

        for (int i = 0; i < list.size(); i++) {

            int count = 0;

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating element: " + list.get(i));
                break;
            }
        }
    }
}