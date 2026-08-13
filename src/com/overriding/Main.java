package com.overriding;

class BankAccount {
	
	    double balance = 0;

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Amount deposited: " + amount);
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Amount withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    void calculateInterest() {
	        System.out.println("General bank interest calculation");
	    }

	    void displayAccountDetails() {
	        System.out.println("Account Balance: " + balance);
	    }
	}


	// Savings Account
class SavingsAccount extends BankAccount {

	    @Override
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Savings Account: Deposited " + amount);
	    }

	    @Override
	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Savings Account: Withdrawn " + amount);
	        } else {
	            System.out.println("Savings Account: Insufficient balance");
	        }
	    }

	    @Override
	    void calculateInterest() {
	        double interest = balance * 0.04;
	        System.out.println("Savings Account Interest: " + interest);
	    }

	    @Override
	    void displayAccountDetails() {
	        System.out.println("----- Savings Account -----");
	        System.out.println("Balance: " + balance);
	    }
	}


	// Current Account
class CurrentAccount extends BankAccount {

	    @Override
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Current Account: Deposited " + amount);
	    }

	    @Override
	    void withdraw(double amount) {
	        if (amount <= balance + 5000) {
	            balance -= amount;
	            System.out.println("Current Account: Withdrawn " + amount);
	        } else {
	            System.out.println("Current Account: Overdraft limit exceeded");
	        }
	    }

	    @Override
	    void calculateInterest() {
	        System.out.println("Current Account: No interest");
	    }

	    @Override
	    void displayAccountDetails() {
	        System.out.println("----- Current Account -----");
	        System.out.println("Balance: " + balance);
	    }
	}


	// Salary Account
class SalaryAccount extends BankAccount {

	    @Override
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Salary Account: Salary credited " + amount);
	    }

	    @Override
	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Salary Account: Withdrawn " + amount);
	        } else {
	            System.out.println("Salary Account: Insufficient balance");
	        }
	    }

	    @Override
	    void calculateInterest() {
	        double interest = balance * 0.05;
	        System.out.println("Salary Account Interest: " + interest);
	    }

	    @Override
	    void displayAccountDetails() {
	        System.out.println("----- Salary Account -----");
	        System.out.println("Balance: " + balance);
	    }
	}


	// Main Class
public class Main {

	    public static void main(String[] args) {

	        SavingsAccount savings = new SavingsAccount();
	        savings.deposit(10000);
	        savings.withdraw(2000);
	        savings.calculateInterest();
	        savings.displayAccountDetails();

	        System.out.println();

	        CurrentAccount current = new CurrentAccount();
	        current.deposit(15000);
	        current.withdraw(18000);
	        current.calculateInterest();
	        current.displayAccountDetails();

	        System.out.println();

	        SalaryAccount salary = new SalaryAccount();
	        salary.deposit(30000);
	        salary.withdraw(5000);
	        salary.calculateInterest();
	        salary.displayAccountDetails();
	    }
	}

