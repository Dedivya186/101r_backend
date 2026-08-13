package com.day3;

import java.util.Scanner;

public class IsLowerornot {

	static boolean isLower(int n) {
        return Character.isLowerCase((char) n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isLower(n) ? "Yes" : "No");
    }
}


