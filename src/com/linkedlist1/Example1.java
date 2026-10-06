package com.linkedlist1;

import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		int right=ll.size()-1;
//		int id=right/2;
//		System.out.println(ll.get(id));
		int left=0;
		while(left<right) {
			left++;
			right--;
		}
		System.out.println(ll.get(left));
		
		
	}

}
