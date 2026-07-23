package com.pack;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1001, "Alice", 5000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + account.getBalance());

        System.out.println();

        account.deposit(2000.0);

        account.withdraw(3000.0);

        account.withdraw(10000.0);

        System.out.println();

        System.out.println("Updated Balance: $" + account.getBalance());
    }
}
