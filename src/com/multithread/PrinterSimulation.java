package com.multithread;

class Printer {

    int paperCount;

    Printer(int paperCount) {
        this.paperCount = paperCount;
    }

    synchronized void printDocument(String document, String userName) {

        if (paperCount > 0) {

            System.out.println(userName + " is printing " + document);

            paperCount--;

            System.out.println("Paper left: " + paperCount);
            System.out.println();

        } else {

            System.out.println(userName + " cannot print " + document);
            System.out.println("No paper available");
            System.out.println();
        }
    }
}


class User extends Thread {

    String name;
    Printer printer;
    String document;

    User(String name, Printer printer, String document) {
        this.name = name;
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.printDocument(document, name);
    }
}


public class PrinterSimulation {

    public static void main(String[] args) {

        Printer printer = new Printer(3);

        User user1 = new User("User 1", printer, "Document 1");
        User user2 = new User("User 2", printer, "Document 2");
        User user3 = new User("User 3", printer, "Document 3");
        User user4 = new User("User 4", printer, "Document 4");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}