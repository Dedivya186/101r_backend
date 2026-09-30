package com.linkedlist;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		ArrayList<Integer> nn=new ArrayList<>();
        nn.add(30);
        nn.add(40);
        nn.add(50);
        nn.add(60);
        ArrayList<Integer> a=new ArrayList<>();
        for(Integer s:v) {
        	if(nn.contains(s)) {
        		System.out.println(s);
        	}
        }
	}

}
