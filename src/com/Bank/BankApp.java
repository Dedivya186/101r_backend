package com.Bank;

public class BankApp {
	
	    public static void main(String[] args) {
	        BankAccount acc = new BankAccount();
	        
	        acc.bankName = "SBI";              
	        acc.branchName = "Hyderabad";       
	        acc.accountNumber = 123456;        
	        acc.setBalance(50000.0);            
	        acc.displayDetails();
	    
	}
}
