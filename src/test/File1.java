package test;
import java.util.*;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter female or male:");
	        String gender = sc.next();

	        System.out.println("Enter age:");
	        int age = sc.nextInt();

	        if ((gender.toLowerCase().equals("female") && age > 23) ||
	            (gender.toLowerCase().equals("male") && age > 27)) {

	            System.out.println("Eligible for voting");
	        } else {
	            System.out.println("Not Eligible");
	        }
	        sc.close();
	}

}
