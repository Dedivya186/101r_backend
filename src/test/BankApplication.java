package test;

public class BankApplication {
		String customerName;
	    String customerAddress;
	    long phoneNumber;
	    double balance;

	    public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
	        this.customerName = customerName;
	        this.customerAddress = customerAddress;
	        this.phoneNumber = phoneNumber;
	        this.balance = balance;

	        System.out.println("Account Created Successfully!");
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid deposit amount");
	        } else {
	            balance += amount;
	            System.out.println("Deposit Successful");
	            System.out.println("Updated Balance: " + balance);
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount");
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal Successful");
	            System.out.println("Remaining Balance: " + balance);
	        }
	    }

	    public void showBalance() {
	        System.out.println("Current Balance: " + balance);
	    
	
	}

}
