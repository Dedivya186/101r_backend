package com.day3;

import java.util.Scanner;

public class AsciiValueOfChar {
	
	    static int getAsciiValue(char ch) {
	        return (int) ch;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        char ch = sc.next().charAt(0);

	        System.out.println(getAsciiValue(ch));
	    }
	}


