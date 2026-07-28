package test;
import java.util.*;
public class BankApplicationDriver {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter your address: ");
	        String address = sc.nextLine();

	        System.out.print("Enter your phone number: ");
	        long phone = sc.nextLong();

	        System.out.print("Enter your initial deposit balance: ");
	        double balance = sc.nextDouble();

	        BankApplication account = new BankApplication(name, address, phone, balance);

	        while (true) {

	            System.out.println("\n**** Select an Option from Below ****");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Show Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your option [1-4]: ");

	            int option = sc.nextInt();

	            switch (option) {

	                case 1:
	                    System.out.print("Enter your withdrawal amount: ");
	                    double withdrawAmount = sc.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter your deposit amount: ");
	                    double depositAmount = sc.nextDouble();
	                    account.deposit(depositAmount);
	                    break;

	                case 3:
	                    account.showBalance();
	                    break;

	                case 4:
	                    System.out.println("Thank You!");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid option");
	            }
	        }
	    
	}

}
