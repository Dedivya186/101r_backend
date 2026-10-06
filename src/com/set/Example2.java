package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example2 {

	public static void main(String[] args) {
		HashSet<Integer>hh=new LinkedHashSet<>();
		hh.add(10);
		hh.add(20);
		hh.add(30);
		hh.add(40);
		hh.add(50);
		hh.add(40);
		System.out.println(hh);

	}

}
