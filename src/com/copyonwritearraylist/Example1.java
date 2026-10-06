package com.copyonwritearraylist;

import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>() ;
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		for(Integer i:ll) {
			if(i==30){
				ll.remove(40);
			}
			System.out.println(i);
		}
		System.out.println(ll);

	}

}
