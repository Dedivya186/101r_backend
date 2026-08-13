package com.day3;

import java.util.Scanner;

public class EquiChar {

	static char getCharacter(int n) {
        return (char) n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getCharacter(n));
}
}