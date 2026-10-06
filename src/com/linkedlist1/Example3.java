package com.linkedlist1;

import java.util.HashSet;
import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		HashSet<Integer> h=new HashSet<>(ll);
		System.out.println(h);

	}

}
