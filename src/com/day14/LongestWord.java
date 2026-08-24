package com.day14;

import java.util.Scanner;

class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String longest = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        // Check the last word
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println("Longest Word: " + longest);
    }
}