package com.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student();

        student.setStudentId(101);
        student.setStudentName("Rahul");
        student.setCourse("Java Full Stack");
        student.setPercentage(88.5);

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Course       : " + student.getCourse());
        System.out.println("Percentage   : " + student.getPercentage());
	}

}
