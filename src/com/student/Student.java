package com.student;

public class Student {
	public int id;
    public String name;
    public String course;
	public void setDetails(int a, String b, String c) {
		 id=a;
		 name=b;
		 course=c;
		
	}
	public void displayDetails() {
		System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
	}
	

}
