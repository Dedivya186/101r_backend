package com.linkedlist1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
//		ListIterator it=new ListIterator<>();
//		while(it.hasPrevious()) {
//			System.out.println(ll.previous());
//		}
		int left=0;
		int right=ll.size()-1;
		while(left<right) {
			int temp=ll.get(right);
			ll.set(right,ll.get(left));
			ll.set(left, temp);
			left++;
			right--;
		}
		System.out.println(ll);
		
	}

}
