package com.vector;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Student> st=new ArrayList<>();
		Student s1=new Student(1,"sai",30000.0);
		Student s2=new Student(2,"bhupal",40000.0);
		Student s3=new Student(3,"divya",50000.0);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(new Student(4,"jeeva",60000.0));
	for( Student s:st) {
		System.out.println(s);
	}
		

	}

}
