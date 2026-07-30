package com.inheritance;

class Employee {
    int salary = 50000;
}

class Manager extends Employee {
    int bonus = 20000;

    public static void main(String[] args) {
        Manager m = new Manager();

        int totalSalary = m.salary + m.bonus;

        System.out.println("Salary: " + m.salary);
        System.out.println("Bonus: " + m.bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}