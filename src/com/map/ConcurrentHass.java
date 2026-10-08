package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class ConcurrentHass {

	public static void main(String[] args) {
//		 Map<Integer,Integer> m=new LinkedHashMap<>();
		Map<Integer,Integer> m=new ConcurrentHashMap<>();
	     m.put(12, 30000);
	     m.put(45, 50000);
	     m.put(67, 90000);
	     m.put(45, 60000);
	     System.out.println(m);
	     Set<Entry<Integer, Integer>> s=m.entrySet();
			for(Entry<Integer, Integer> entry:s) {
				m.put(90, 800000);
				System.out.println(entry);
			}
	}

}
