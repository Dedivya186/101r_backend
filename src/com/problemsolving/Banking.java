package com.problemsolving;
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    protected double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit : " + amount);
        System.out.println("Balance : " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Withdrawal denied!");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}


        
 

public class Banking {
 public static void main(String args[]) {
	BankAccount account;

    account = new SavingsAccount(101, "Rahul", 20000);

    System.out.println("Savings Account");
    System.out.println("----------------");
    account.displayDetails();

    System.out.println();
    account.deposit(5000);

    System.out.println();
    account.withdraw(10000);

}
}
