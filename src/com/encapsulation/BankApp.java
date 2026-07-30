package com.encapsulation;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

        account.setAccountNumber(123456789L);
        account.setAccountHolderName("Priya");
        account.setBalance(50000.0);

        System.out.println("Bank Account Details");
        System.out.println("--------------------");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Balance        : " + account.getBalance());
	}

}
