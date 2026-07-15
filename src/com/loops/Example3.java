package com.loops;
import java.util.*;
public class Example3 {
	public static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

       
        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

       
        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isUgly(n)) {
            System.out.println(n + " is an Ugly Number.");
        } else {
            System.out.println(n + " is Not an Ugly Number.");
        }

    }
}
