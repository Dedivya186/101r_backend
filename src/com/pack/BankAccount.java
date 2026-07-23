package com.pack;

public class BankAccount {
	    int accountNumber;
	    String accountHolder;
	    double balance;

	    BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        this.balance = this.balance + amount;
	        System.out.println("Deposited: $" + amount);
	    }

	    // Business Logic Method: withdraw
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            this.balance = this.balance - amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    
}
}