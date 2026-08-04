package com.inheritance1;


import java.util.Scanner;

class StockHandler {

    String handlerName;
    String handlerId;

    public StockHandler(String handlerName, String handlerId) {
        this.handlerName = handlerName;
        this.handlerId = handlerId;
    }

    public void displayParentData() {
        System.out.println("Handler Name : " + handlerName);
        System.out.println("Handler ID   : " + handlerId);
    }
}

class StockPerformance extends StockHandler {

    int stock[] = new int[100];
    int count = 0;
    int totalStock = 0;
    double averageStock = 0;
    String handlingGrade = "Not Calculated";

    public StockPerformance(String handlerName, String handlerId) {
        super(handlerName, handlerId);
        System.out.println("Stock Performance Profile Created");
    }

    public void addStockEntry(int quantity) {

        if (quantity <= 0) {
            System.out.println("Invalid Stock Quantity...");
        } else {
            stock[count] = quantity;
            count++;
            System.out.println("Stock Entry Added Successfully.");
        }
    }

    public void recalculatePerformance() {

        if (count == 0) {
            System.out.println("No Stock Entries Available...");
            return;
        }

        totalStock = 0;

        for (int i = 0; i < count; i++) {
            totalStock += stock[i];
        }

        averageStock = (double) totalStock / count;

        if (averageStock >= 50) {
            handlingGrade = "Efficient";
        } else if (averageStock >= 30) {
            handlingGrade = "Average";
        } else {
            handlingGrade = "Needs Improvement";
        }

        System.out.println("Performance Recalculated Successfully.");
    }

    public void performanceSummary() {

        displayParentData();
        System.out.println("Total Stock Handled      : " + totalStock);
        System.out.println("Average Stock Per Entry  : " + averageStock);
        System.out.println("Handling Grade           : " + handlingGrade);
    }
}

public class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Handler Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Handler ID : ");
        String id = sc.nextLine();

        StockPerformance sp = new StockPerformance(name, id);

        boolean status = true;

        while (status) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Stock Entry");
            System.out.println("2. Recalculate Performance");
            System.out.println("3. View Stock Performance Summary");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Stock Quantity : ");
                int quantity = sc.nextInt();
                sp.addStockEntry(quantity);
                break;

            case 2:
                sp.recalculatePerformance();
                break;

            case 3:
                System.out.println("\nStock Performance Summary");
                sp.performanceSummary();
                break;

            case 4:
                System.out.println("Thank You!");
                status = false;
                break;

            default:
                System.out.println("Invalid Choice...");
            }
        }

        sc.close();
    }
}