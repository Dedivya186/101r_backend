package com.inheritance2;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter Value of B: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}