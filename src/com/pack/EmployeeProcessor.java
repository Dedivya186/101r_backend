package com.pack;
import java.util.*;
public class EmployeeProcessor {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int emp=sc.nextInt();
        String emp_name=sc.next();
        String desg=sc.next();
        double a=sc.nextInt();
        int rate=sc.nextInt();
		Employee obj=new Employee(emp,emp_name,desg,a,rate);
      obj.showDetails();
      obj.promoteEmployee(4);
      
      
	}

}
