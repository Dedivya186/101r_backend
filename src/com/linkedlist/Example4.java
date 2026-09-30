package com.linkedlist;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> v=new ArrayList<>();
		v.add("hello");
		v.add("hi");
		v.add("hey");
		v.add("hoo");
		v.add("hoo");
		for (int i=0;i<v.size();i++) {
			for(int j=i+1;j<v.size();j++) {
				if(v.get(i).equals(v.get(j))) {
					System.out.println(v.get(i));
					break;
				}
			}
		}

	}

}
