package test;
import java.util.*;
public class Student1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter Student ID: ");
    int studentId = sc.nextInt();
    sc.nextLine(); 

    System.out.print("Enter Student Name: ");
    String studentName = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine(); 

    System.out.print("Enter Course: ");
    String course = sc.nextLine();

    System.out.println("\n----- Student Details -----");
    System.out.println("Student ID   : " + studentId);
    System.out.println("Student Name : " + studentName);
    System.out.println("Age          : " + age);
    System.out.println("Course       : " + course);

    sc.close();
}
}
