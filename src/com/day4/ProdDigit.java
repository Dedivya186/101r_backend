package com.day4;

import java.util.Scanner;

public class ProdDigit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int product = 1;

        n = Math.abs(n);

       
            while (n > 0) {
                int digit = n % 10;
                product *= digit;
                n = n / 10;
            }
        

        System.out.println(product);
	}

}
