package com.constraturchaining;

class  Parent{
	String name;
	Parent(String name){
		this.name=name;	}
}
public class Student extends Parent{
	String name;
	Student(String name){
		super("John Doe");
		this.name=name;
	}
	public void display(){
		System.out.println("Parent Name : "+super.name);
		System.out.println("Child Name :"+this.name);
	}
      
	public static void main(String[] args) {
       Student s=new Student("Alice Smith");
       s.display();
	}

}
