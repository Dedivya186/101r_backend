package com.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}

}
