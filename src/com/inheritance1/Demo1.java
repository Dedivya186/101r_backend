package com.inheritance1;


import java.util.Scanner;

class Subscription {

    String subscriberName;
    String planType;
    double planCost;

    public Subscription(String subscriberName, String planType, double planCost) {

        this.subscriberName = subscriberName;
        this.planType = planType;

        if (planCost > 0) {
            this.planCost = planCost;
        } else {
            System.out.println("Invalid Plan Cost...");
            this.planCost = 0;
        }
    }

    public void displayParentData() {
        System.out.println("Subscriber Name      : " + subscriberName);
        System.out.println("Plan Type            : " + planType);
        System.out.println("Plan Cost            : " + planCost);
    }
}

class SubscriptionPlan extends Subscription {

    double paidAmount;
    String subscriptionStatus;

    public SubscriptionPlan(String subscriberName, String planType, double planCost) {

        super(subscriberName, planType, planCost);

        this.paidAmount = 0;
        this.subscriptionStatus = "Active";

        System.out.println("Subscription Profile Created");
    }

    public void updatePaidAmount(double amount) {

        if (amount >= 0 && amount <= planCost) {
            this.paidAmount = amount;
            System.out.println("Paid Amount Updated Successfully.");
        } else {
            System.out.println("Invalid Paid Amount...");
        }
    }

    public void updateSubscriptionStatus(String status) {

        if (status == null || status.equals("")) {
            System.out.println("Invalid Subscription Status...");
        } else {
            this.subscriptionStatus = status;
            System.out.println("Subscription Status Updated Successfully.");
        }
    }

    public void subscriptionSummary() {

        displayParentData();
        System.out.println("Paid Amount          : " + paidAmount);
        System.out.println("Subscription Status  : " + subscriptionStatus);
    }
}

public class Demo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subscriber Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Plan Type : ");
        String type = sc.nextLine();

        System.out.print("Enter Plan Cost : ");
        double cost = sc.nextDouble();

        SubscriptionPlan sp = new SubscriptionPlan(name, type, cost);

        boolean status = true;

        while (status) {

            System.out.println("\n------ MENU ------");
            System.out.println("1. Update Paid Amount");
            System.out.println("2. Change Subscription Status");
            System.out.println("3. View Subscription Summary");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                System.out.print("Enter Paid Amount : ");
                double amount = sc.nextDouble();
                sp.updatePaidAmount(amount);
                break;

            case 2:
                sc.nextLine();
                System.out.print("Enter New Subscription Status : ");
                String subStatus = sc.nextLine();
                sp.updateSubscriptionStatus(subStatus);
                break;

            case 3:
                System.out.println("\nSubscription Summary");
                sp.subscriptionSummary();
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
