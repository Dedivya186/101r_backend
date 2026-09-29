package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		 list.add(20);
       list.add(12);
       list.add(26);
       list.add(48);
       list.add(29);
       System.out.println(list);
      Iterator<Integer> itr=list.iterator();
       while(itr.hasNext()) {
    	   int a=itr.next();
    	   if(a==12) {
    		   itr.remove();
    	   }
       }
       System.out.println(list);

	}

}
