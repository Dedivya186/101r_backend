package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Example1 {

	public static void main(String[] args) {
        Collection <String> movies=new ArrayList<>();
        movies.add("hello");
        movies.add("kgf");
        movies.add("og");
        movies.add("rrr");
        System.out.println(movies);
        System.out.println(movies.size());
        System.out.println(movies.contains("rrr"));
        System.out.println(movies.remove("kgf"));
        System.out.println(movies);
        movies.clear();
        System.out.println(movies);
        System.out.println(movies.isEmpty());
	}

	
}
