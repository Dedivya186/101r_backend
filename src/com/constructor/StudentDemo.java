package com.constructor;

class Student {
    int studentId;
    String studentName;
    String course;

    Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    Student(Student s) {
        this.studentId = s.studentId;
        this.studentName = s.studentName;
        this.course = s.course;
    }

    void display() {
        System.out.println("ID      : " + studentId);
        System.out.println("Name    : " + studentName);
        System.out.println("Course  : " + course);
    }
}

class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", "Java Full Stack");
       Student s2 = new Student(s1);

        System.out.println("Student 1 Details");
        System.out.println("-----------------");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details");
        System.out.println("-----------------");
        s2.display();
    }
}