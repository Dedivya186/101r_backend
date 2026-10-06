package com.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		Deque<Integer>d=new LinkedList<>();
		d.offerFirst(12);
		d.offerLast(45);
		d.offerFirst(67);
		d.push(34);
		d.offerLast(45);
		d.addLast(56);
		d.poll();
		d.offer(71);
		d.pop();
		
		d.offer(56);
		System.out.println(d);

	}

}
