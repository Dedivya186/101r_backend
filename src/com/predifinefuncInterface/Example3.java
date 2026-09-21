package com.predifinefuncInterface;
import java.util.function.Function;
class Student{
	String name;
	String desg;
	public Student(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}
	public String getName() {
		return name;
	}
	public String getDesg() {
		return desg;
	}
	
}
public class Example3 {

	public static void main(String[] args) {
      Student func=new Student("Diya","software engineer");
      Function<Student,String> f=new Function<Student,String>(){

		@Override
		public String apply(Student t) {
			
			return t.getName();
		}
    	  
      };
      System.out.println(f.apply(func));
	}

}
