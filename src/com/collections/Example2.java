package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Example2 {

	public static void main(String[] args) {
		 Collection <String> java=new ArrayList<>();
	        java.add("bhupal");
	        java.add("sai");
	        java.add("jeeva");
	        java.add("divy");
	     Collection <String> python=new ArrayList<>();
	     python.add("suma");
	     python.add("devi");
	     python.add("kaveri");
	     python.add("reshma");
	     System.out.println(java);
	     System.out.println(python);
//	     java.retainAll(python);
//	     System.out.println(java);
//	     System.out.println(java.containsAll(python));
	     java.addAll(python);
	     System.out.println(java);
	}

}
