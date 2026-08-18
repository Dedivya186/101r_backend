package com.day9;

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed Successfully");
        } else {
            System.out.println("Book is Already Borrowed");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book Returned Successfully");
        } else {
            System.out.println("Book is Already Available");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("Borrow: ");
        String borrow = sc.nextLine();

        Book book = new Book(title, author, true);

        if (borrow.equalsIgnoreCase("Yes")) {
            book.borrowBook();
        }
    }
}