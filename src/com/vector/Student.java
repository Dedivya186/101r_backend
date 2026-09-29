package com.vector;

public class Student {
    int std_id;
    String std_name;
    double fees;
    
	public Student(int std_id, String std_name, double fees) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.fees = fees;
	}

	public String toString() {
		return "Student:[std_id:"+std_id+ " std_name:"+std_name+" fees:"+fees+"]";
		
	}

}
