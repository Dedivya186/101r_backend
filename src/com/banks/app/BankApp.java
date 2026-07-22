package com.banks.app;
import com.banks.accounts.BankAccount;
import com.banks.customers.Customer;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
        account.setAccountNumber("AC1023456");
        account.setBalance(75000.00);

        Customer customer = new Customer();
        customer.setCustomerName("Anjali Mehta");
        customer.setCustomerId(2031);

        account.showAccountDetails();
        System.out.println();
        customer.showCustomerDetails();
	}

}
