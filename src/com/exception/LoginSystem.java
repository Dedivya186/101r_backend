package com.exception;

import java.util.Scanner;

class InvalidUsername extends Exception {

    public InvalidUsername(String msg) {
        super(msg);
    }
}

class InvalidPassword extends Exception {

    public InvalidPassword(String msg) {
        super(msg);
    }
}

public class LoginSystem {

    public static void login(String username, String password)
            throws InvalidUsername, InvalidPassword {

        String correctUsername = "admin";
        String correctPassword = "12345";

        if (!username.equals(correctUsername)) {
            throw new InvalidUsername("Incorrect Username");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidPassword("Incorrect Password");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            login(username, password);
        }
        catch (InvalidUsername e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidPassword e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}