package com.day3;

import java.util.Scanner;

public class isUpperOrNot {

	static boolean isUpper(int n) {
        return Character.isUpperCase((char) n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isUpper(n) ? "Yes" : "No");
    }

}
