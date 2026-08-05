package com.inheritance2;

import java.util.Scanner;

class InsurancePolicy {

    private String customerName;
    private String policyType;
    private double policyAmount;
    private double approvedAmount;
    private String policyStatus;

    // Default Constructor
    public InsurancePolicy() {
        policyStatus = "Pending";
        System.out.println("Policy Profile Created");
    }

    // Constructor with Customer Name and Policy Type
    public InsurancePolicy(String customerName, String policyType) {
        this();
        this.customerName = customerName;
        this.policyType = policyType;
    }

    // Constructor with all details
    public InsurancePolicy(String customerName, String policyType, double policyAmount) {
        this(customerName, policyType);
        setPolicyAmount(policyAmount);
    }

    // Setter for Policy Amount
    public void setPolicyAmount(double policyAmount) {
        if (policyAmount > 0) {
            this.policyAmount = policyAmount;
        } else {
            System.out.println("Invalid Policy Amount.");
        }
    }

    // Setter for Approved Amount
    public void setApprovedAmount(double approvedAmount) {

        if (approvedAmount < 0) {
            System.out.println("Approved Amount cannot be negative.");
        } else if (approvedAmount > policyAmount) {
            System.out.println("Approved Amount cannot exceed Policy Amount.");
        } else {
            this.approvedAmount = approvedAmount;
            System.out.println("Approved Amount Updated Successfully.");
        }
    }

    // Setter for Policy Status
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        System.out.println("Policy Status Updated Successfully.");
    }

    // Display Summary
    public void displaySummary() {

        System.out.println("\nPolicy Summary");
        System.out.println("Customer: " + customerName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Policy Amount: " + policyAmount);
        System.out.println("Approved Amount: " + approvedAmount);
        System.out.println("Policy Status: " + policyStatus);
    }
}

public class Example2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Policy Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Policy Amount: ");
        double amount = sc.nextDouble();

        InsurancePolicy policy =
                new InsurancePolicy(name, type, amount);

        int choice = 0;
        boolean status = true;

        while (status) {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Update Approved Amount");
            System.out.println("2. Change Policy Status");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Approved Amount: ");
                    double approved = sc.nextDouble();
                    policy.setApprovedAmount(approved);
                    break;

                case 2:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter New Policy Status: ");
                    String policyStatus = sc.nextLine();
                    policy.setPolicyStatus(policyStatus);
                    break;

                case 3:
                    policy.displaySummary();
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