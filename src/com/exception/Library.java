package com.exception;

import java.util.Scanner;

class InvalidBookQuantity extends Exception {

    public InvalidBookQuantity(String msg) {
        super(msg);
    }
}

class BooksNotAvailable extends Exception {

    public BooksNotAvailable(String msg) {
        super(msg);
    }
}

public class Library {

    public static void issueBook(int availableBooks, int requestedBooks)
            throws InvalidBookQuantity, BooksNotAvailable {

        if (requestedBooks <= 0) {
            throw new InvalidBookQuantity("Requested books must be greater than 0");
        }

        if (requestedBooks > availableBooks) {
            throw new BooksNotAvailable("Requested books are more than available books");
        }

        availableBooks = availableBooks - requestedBooks;

        System.out.println("Books issued successfully");
        System.out.println("Books issued: " + requestedBooks);
        System.out.println("Remaining books: " + availableBooks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available books: ");
        int availableBooks = sc.nextInt();

        System.out.print("Enter number of books requested: ");
        int requestedBooks = sc.nextInt();

        try {
            issueBook(availableBooks, requestedBooks);
        }
        catch (InvalidBookQuantity e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (BooksNotAvailable e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}