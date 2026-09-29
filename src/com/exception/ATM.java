package com.exception;
class UnSuffiecient extends Exception {

    public UnSuffiecient(String msg) {
        super(msg);
    }
}

class InvalidAmount extends Exception {

    public InvalidAmount(String msg) {
        super(msg);
    }
}

public class ATM {

    public void withdraw(int amount, int balance)
            throws UnSuffiecient, InvalidAmount {

        if (amount > balance) {
            throw new UnSuffiecient("This is insufficient balance");
        }

        if (amount <= 0) {
            throw new InvalidAmount("Withdrawal amount must be greater than 0");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }

    public static void main(String[] args) {

        ATM atm = new ATM();

        try {
            atm.withdraw(500, 1000);
        }
        catch (UnSuffiecient e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmount e) {
            System.out.println(e.getMessage());
        }
    }
}
