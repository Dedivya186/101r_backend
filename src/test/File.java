package test;
import java.util.*;
public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter naem:");
 String name=sc.next();
 sc.nextLine();
 System.out.println("enter id: ");
 int id=sc.nextInt();
 System.out.println("enter phone number:");
 long phoneNumber=sc.nextLong();
 System.out.println("enter address:");
 sc.next();
 String address=sc.nextLine();
 System.out.println("enter pincode:");
 int pincode=sc.nextInt();
 sc.close();
	}

}
