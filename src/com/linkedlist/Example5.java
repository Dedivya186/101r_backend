package com.linkedlist;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(10);
		v.add(20);
		v.add(10);
		v.add(40);
		v.add(20);
		ArrayList<Integer> nn=new ArrayList<>();
		for(Integer s:v) {
			if(!nn.contains(s)) {
				nn.add(s);
			}
		}
		System.out.println(nn);

	}

}
