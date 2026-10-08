package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(12, "Java");//16)12( 12
		map.put(34, "Python");//16)34(2  2 
		map.put(64, "Html");// 16)64(4 0
		map.put(78, "C++");//16)78( 14
		map.put(34, "sql");
		System.out.println(map);// 64 34 12 78
		System.out.println(map.getOrDefault(90, "Not found"));
		System.out.println(map.keySet());
		System.out.println(map.putIfAbsent(56,"Hii"));
		System.out.println(map.values());
		Set<Entry<Integer,String>> entries=map.entrySet();
		for(Entry<Integer,String> entry:entries) {
			System.out.println(entry);
		}

	}

}
