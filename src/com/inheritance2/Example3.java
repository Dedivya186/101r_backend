package com.inheritance2;

import java.util.Scanner;

class SalesEmployee {

    String employeeName;
    int employeeId;

    public SalesEmployee(String employeeName, int employeeId) {

        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public void displayParentData() {

        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID   : " + employeeId);
    }
}

class PerformanceEmployee extends SalesEmployee {

    double totalSales;
    double averageSales;
    String performanceGrade;
    int salesCount;

    public PerformanceEmployee(String employeeName, int employeeId) {

        super(employeeName, employeeId);

        totalSales = 0;
        averageSales = 0;
        performanceGrade = "Not Calculated";
        salesCount = 0;

        System.out.println("Performance Profile Created");
    }

    // Add Sales
    public void addSales(double sales) {

        if (sales <= 0) {

            System.out.println("Invalid Sales Amount.");

        } else {

            totalSales += sales;
            salesCount++;

            System.out.println("Sales Entry Added Successfully.");
        }
    }

    // Calculate Result
    public void calculatePerformance() {

        if (salesCount == 0) {

            System.out.println("No Sales Entries Available.");
            return;
        }

        averageSales = totalSales / salesCount;

        if (averageSales >= 15000) {
            performanceGrade = "Excellent";
        } else if (averageSales >= 10000) {
            performanceGrade = "Good";
        } else if (averageSales >= 5000) {
            performanceGrade = "Average";
        } else {
            performanceGrade = "Poor";
        }

        System.out.println("Performance Result Calculated Successfully.");
    }

    // Display Summary
    public void performanceSummary() {

        displayParentData();

        System.out.println("Total Sales      : " + totalSales);
        System.out.println("Average Sales    : " + averageSales);
        System.out.println("Performance Grade: " + performanceGrade);
    }
}

public class Example3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        PerformanceEmployee pe = new PerformanceEmployee(name, id);

        boolean status = true;

        while (status) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Sales");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Sales Amount : ");
                double sales = sc.nextDouble();

                pe.addSales(sales);

                break;

            case 2:

                pe.calculatePerformance();

                break;

            case 3:

                pe.performanceSummary();

                break;

            case 4:

                System.out.println("Thank You...");
                status = false;

                break;

            default:

                System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}