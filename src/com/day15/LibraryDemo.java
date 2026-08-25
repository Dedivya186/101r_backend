package com.day15;

import java.util.ArrayList;

class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean available;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayBook() {

        System.out.println(
            "ID: " + bookId +
            ", Title: " + title +
            ", Author: " + author +
            ", Available: " + available
        );
    }
}

class Member {

    private int memberId;
    private String name;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}

class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(
            book.getTitle() + " added to library."
        );
    }

    public void searchBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                System.out.println("Book Found:");
                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void issueBook(String title, Member member) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (!book.isAvailable()) {
                    System.out.println("Book is already issued.");
                    return;
                }

                book.setAvailable(false);

                System.out.println(
                    "Book: " + book.getTitle()
                );

                System.out.println(
                    "Issued To: " + member.getName()
                );

                System.out.println("Status: Issued");

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isAvailable()) {
                    System.out.println("Book is already available.");
                    return;
                }

                book.setAvailable(true);

                System.out.println(
                    "Book returned: " + book.getTitle()
                );

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void displayBooks() {

        System.out.println("----- Available Books -----");

        for (Book book : books) {

            if (book.isAvailable()) {
                book.displayBook();
            }
        }
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(
            101,
            "Java Programming",
            "James Gosling"
        );

        Book b2 = new Book(
            102,
            "Python Programming",
            "Guido van Rossum"
        );

        Book b3 = new Book(
            103,
            "Data Structures",
            "Robert Lafore"
        );

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Member m1 = new Member(1, "Suman");
        Member m2 = new Member(2, "Ravi");

        System.out.println();

        library.searchBook("Java Programming");

        System.out.println();

        library.issueBook("Java Programming", m1);

        System.out.println();

        // Another member tries to issue the same book
        library.issueBook("Java Programming", m2);

        System.out.println();

        library.displayBooks();

        System.out.println();

        library.returnBook("Java Programming");

        System.out.println();

        library.displayBooks();
    }
}