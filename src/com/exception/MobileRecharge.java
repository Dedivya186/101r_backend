package com.exception;

import java.util.Scanner;

class InvalidMobileNumber extends Exception {

    public InvalidMobileNumber(String msg) {
        super(msg);
    }
}

class InvalidRechargeAmount extends Exception {

    public InvalidRechargeAmount(String msg) {
        super(msg);
    }
}

class InsufficientBalance extends Exception {

    public InsufficientBalance(String msg) {
        super(msg);
    }
}

public class MobileRecharge {

    public static void recharge(String mobile, double amount, double balance)
            throws InvalidMobileNumber, InvalidRechargeAmount, InsufficientBalance {

        if (mobile.length() != 10) {
            throw new InvalidMobileNumber("Mobile number must contain exactly 10 digits");
        }

        if (amount <= 0) {
            throw new InvalidRechargeAmount("Recharge amount must be greater than 0");
        }

        if (amount > balance) {
            throw new InsufficientBalance("Insufficient wallet balance");
        }

        balance = balance - amount;

        System.out.println("Recharge Successful");
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Recharge Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter recharge amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();

        try {
            recharge(mobile, amount, balance);
        }
        catch (InvalidMobileNumber e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InvalidRechargeAmount e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InsufficientBalance e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}