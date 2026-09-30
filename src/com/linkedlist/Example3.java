package com.linkedlist;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(10);
		v.add(20);
		v.add(10);
		v.add(40);
		v.add(20);
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
