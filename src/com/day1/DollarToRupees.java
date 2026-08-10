package com.day1;


import java.util.Scanner;

public class DollarToRupees {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dollar = sc.nextInt();

        double rupees = dollar * 83;

        System.out.println(rupees);
    }
}