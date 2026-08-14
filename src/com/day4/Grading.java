package com.day4;

import java.util.Scanner;

public class Grading {
	static String findGrade(int score) {

        if (score < 0 || score > 100) {
            return "Invalid";
        } 
        else if (score >= 90) {
            return "A+";
        } 
        else if (score >= 80) {
            return "A";
        } 
        else if (score >= 70) {
            return "B+";
        } 
        else if (score >= 60) {
            return "B";
        } 
        else if (score >= 50) {
            return "C+";
        } 
        else if (score >= 40) {
            return "C";
        } 
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        System.out.println(findGrade(score));
    }

}
