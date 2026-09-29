package com.collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
ArrayList<String> tasks=new ArrayList<>();
tasks.add("complete assignment");
tasks.add("problem solving");
tasks.add("compilation of project");
tasks.add("submit repost");
System.out.println(tasks);
tasks.add(0,"talking with friends");
System.out.println(tasks);
System.out.println(tasks.get(2));

	}

}
