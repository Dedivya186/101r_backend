package com.loops;

public class Example2 {

	public static void main(String[] args) {
		
        int num =153 ;

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
}
