package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap {

	public static void main(String[] args) {
     Map<Integer,Integer> m=new LinkedHashMap<>();
     m.put(12, 30000);
     m.put(45, 50000);
     m.put(67, 90000);
     m.put(45, 60000);
     System.out.println(m);
	}

}
