package com.day4;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        n = Math.abs(n);

       
            while (n > 0) {
                count++;
                n = n / 10;
            }
        

        System.out.println(count);
    }

}
