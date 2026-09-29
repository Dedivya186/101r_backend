package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(0,34);
		a.add(30);
		a.set(1, 29);
		a.set(2, 56);
		a.remove(4);
		a.remove(2);
		
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(12,45));
		a.addAll(4,a1);
		System.out.println(a);

	}

}
