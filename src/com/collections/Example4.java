package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		 list.add(20);
        list.add(12);
        list.add(26);
        list.add(48);
        list.add(29);
        System.out.println(list);
        ListIterator<Integer> itr=list.listIterator(1);
//        while(itr.hasPrevious()) {//dead statement
//        	System.out.print(itr.previous()+" ");
//        }
        while(itr.hasNext()) {//dead statement
        	System.out.print(itr.next()+" ");
        }

	}

}
