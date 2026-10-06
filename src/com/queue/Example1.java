package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
//		q.add("sai");
//		q.add("siv");
//		q.add("divya");
//		q.add("bhu");
//		q.add(1,23);//
//		q.remove();
//		q.poll();
		q.offer("sai");
		q.add("siv");
		q.add("divya");
		q.add("bhu");
		System.out.println(q.element());
//		System.out.println(q.peek());
		System.out.println(q);
	}

}
