package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String str="Program";
		char ch[]=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet());
		Set<Entry<Character,Integer>> s=map.entrySet();
		for(Entry<Character,Integer> entry:s) {
			System.out.println(entry);
		}

	}

}
