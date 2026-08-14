package com.day4;

import java.util.Scanner;

public class NToOne {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 5; i <= n; i += 5) {
            System.out.print(i + " ");
        }
    }

}
