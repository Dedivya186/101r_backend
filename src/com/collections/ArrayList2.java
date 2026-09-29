package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> games=new ArrayList<>();
		games.add("kabadi");
		games.add("cricket");
		games.add("valley ball");
		games.add("hockey");
		System.out.println(games);
		ArrayList<String> game=new ArrayList<>(Arrays.asList("table tennis"));
        System.out.println(game);
        System.out.println(game.addAll(1,game));


	}

}
