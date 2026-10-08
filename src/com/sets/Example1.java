package com.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
        SortedSet<Integer> set=new TreeSet<>();
        set.add(45);
        set.add(67);
//        set.add(45);
        set.add(34);
        set.add(12);
        set.add(65);
        set.add(72);
//        System.out.println(set.first());
//        System.out.println(set.last());
       
        System.out.println(set);
        System.out.println(set.headSet(67));
        System.out.println(set.tailSet(34));
        System.out.println(set.subSet(34, 72));
	}

}
