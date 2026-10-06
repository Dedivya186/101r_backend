package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		q1.add(45);
		q1.add(22);
		q1.add(67);
		q1.add(12);
		System.out.println(q1);
	}

}
