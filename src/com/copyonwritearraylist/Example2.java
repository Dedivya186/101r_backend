package com.copyonwritearraylist;

import java.util.concurrent.CopyOnWriteArrayList;

public class Example2 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> ll=new CopyOnWriteArrayList<>() ;
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		for(Integer i:ll) {
			if(i==30){
				ll.add(1,60);
			}
			System.out.println(i);
		}
		System.out.println(ll);
	}

}
