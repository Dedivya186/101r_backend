package com.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example2_Navigable {

	public static void main(String[] args) {
		NavigableSet<Integer> nn=new TreeSet<>();
		nn.add(10);
		nn.add(40);
		nn.add(30);
		nn.add(60);
		nn.add(20);
		nn.add(100);
		nn.add(50);
		System.out.println(nn);
//		System.out.println(nn.ceiling(40));
//		System.out.println(nn.ceiling(45));
//		System.out.println(nn.floor(30));
//		System.out.println(nn.floor(25));
//		System.out.println(nn.higher(40));
//		System.out.println(nn.lower(30));
//		System.out.println(nn.pollFirst());
//		System.out.println(nn.pollLast());
		System.out.println(nn.tailSet(20,false));
		System.out.println(nn.subSet(20, false,100, false));
		

	}

}
