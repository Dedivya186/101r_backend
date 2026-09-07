package com.abstraction;

import java.util.*;

abstract class User {

    String username;
    String email;
    String role;

    User(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    abstract void accessDashboard();

    void login() {
        System.out.println("Login successful.");
    }

    void logout() {
        System.out.println("Logout successful.");
    }

    void updateProfile() {
        System.out.println("Profile updated successfully.");
    }
}

class Student extends User {

    ArrayList<String> enrolledCourses;
    ArrayList<Integer> grades;

    Student(String username, String email,
            ArrayList<String> enrolledCourses,
            ArrayList<Integer> grades) {

        super(username, email, "Student");
        this.enrolledCourses = enrolledCourses;
        this.grades = grades;
    }

    @Override
    void accessDashboard() {
        System.out.println(
            "Accessing student dashboard: Enrolled Courses: "
            + String.join(", ", enrolledCourses)
            + "; Grades: " + grades.toString().replace("[", "").replace("]", "")
        );
    }
}

class Instructor extends User {

    ArrayList<String> createdCourses;
    HashMap<String, ArrayList<String>> studentSubmissions;

    Instructor(String username, String email,
               ArrayList<String> createdCourses,
               HashMap<String, ArrayList<String>> studentSubmissions) {

        super(username, email, "Instructor");
        this.createdCourses = createdCourses;
        this.studentSubmissions = studentSubmissions;
    }

    @Override
    void accessDashboard() {

        System.out.print("Accessing instructor dashboard: Created Courses: "
                + String.join(", ", createdCourses)
                + "; Student Submissions: ");

        for (String course : studentSubmissions.keySet()) {
            System.out.print(course + " - "
                    + String.join(", ", studentSubmissions.get(course)));
        }

        System.out.println();
    }
}

class Admin extends User {

    HashMap<String, Integer> siteAnalytics;
    ArrayList<String> userManagementTools;

    Admin(String username, String email,
          HashMap<String, Integer> siteAnalytics,
          ArrayList<String> userManagementTools) {

        super(username, email, "Admin");
        this.siteAnalytics = siteAnalytics;
        this.userManagementTools = userManagementTools;
    }

    @Override
    void accessDashboard() {

        System.out.println(
            "Accessing admin dashboard: Site Analytics - Visitors: "
            + siteAnalytics.get("visitors")
            + ", Courses: "
            + siteAnalytics.get("courses")
            + "; User Management Tools: "
            + String.join(", ", userManagementTools)
        );
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student(
                "student1",
                "student1@example.com",
                new ArrayList<>(Arrays.asList("Math", "Science")),
                new ArrayList<>(Arrays.asList(90, 85))
        );

        s.accessDashboard();
        s.login();
        s.logout();
        s.updateProfile();

        System.out.println();

        Instructor i = new Instructor(
                "instructor1",
                "instructor1@example.com",
                new ArrayList<>(Arrays.asList("Math 101")),
                new HashMap<>()
        );

        i.studentSubmissions.put(
                "Math 101",
                new ArrayList<>(Arrays.asList("Submission 1", "Submission 2"))
        );

        i.accessDashboard();
        i.login();
        i.logout();
        i.updateProfile();

        System.out.println();

        Admin a = new Admin(
                "admin1",
                "admin1@example.com",
                new HashMap<>(),
                new ArrayList<>(Arrays.asList("Add User", "Remove User"))
        );

        a.siteAnalytics.put("visitors", 1000);
        a.siteAnalytics.put("courses", 50);

        a.accessDashboard();
        a.login();
        a.logout();
        a.updateProfile();
    }
}