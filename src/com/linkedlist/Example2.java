package com.linkedlist;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<String> song=new LinkedList<>();
		song.add("aaya sher");
		song.add("sammakka");
		song.add("mallipuvula pallaki");
		song.add("ooh mama ");
		System.out.println(song);
		song.addFirst("hello yakada unnav hello");
		System.out.println(song);
		System.out.println(song.getFirst());
		System.out.println(song.getLast());
		System.out.println(song.removeFirst());

	}

}
