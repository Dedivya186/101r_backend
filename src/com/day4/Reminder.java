package com.day4;

import java.util.Scanner;

public class Reminder {

	static int findRemainder(int n, int m) {
        if (n > m) {
            return n % m;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = findRemainder(n, m);

        System.out.println(result);
    }

}
