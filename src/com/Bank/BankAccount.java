package com.Bank;

public class BankAccount {
	public String bankName;
    private double balance;
    protected String branchName;
    int accountNumber;  
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayDetails() {
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Branch Name    : " + branchName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
    
}

