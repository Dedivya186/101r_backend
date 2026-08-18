package com.day9;

import java.util.Scanner;

class Students {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
    	
    	    if (marks >= 90)
    	        return "A+";
    	    else if (marks >= 80)
    	        return "B";
    	    else if (marks >= 70)
    	        return "C";
    	    else if (marks >= 60)
    	        return "D";
    	    else
    	        return "Fail";
    	}
    
}

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students s = new Students();

        System.out.print("Marks: ");
        s.setMarks(sc.nextInt());

        System.out.println("Grade: " + s.getGrade());
    }
}