package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Courses {

	private int courseId;
    private String courseName;
    private int duration;
    private double fee;

    public Courses(int courseId, String courseName, int duration, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }




    public static void main(String[] args) {

        ArrayList<Courses> availableCourses = new ArrayList<>();
        ArrayList<Courses> enrolledCourses = new ArrayList<>();

        availableCourses.add(new Courses(101, "Java", 3, 5000));
        availableCourses.add(new Courses(102, "Python", 2, 4000));
        availableCourses.add(new Courses(103, "SQL", 2, 3000));
        availableCourses.add(new Courses(104, "HTML", 1, 2000));
        availableCourses.add(new Courses(105, "CSS", 1, 2500));

        enrolledCourses.add(new Courses(106, "JavaScript", 3, 4500));
        enrolledCourses.add(new Courses(107, "React", 3, 5500));

        availableCourses.addAll(enrolledCourses);

        System.out.println("All enrolled courses present: "
                + availableCourses.containsAll(enrolledCourses));

        availableCourses.remove(2);

        Iterator<Courses> itr = availableCourses.iterator();

        while (itr.hasNext()) {

            Courses c = itr.next();

            System.out.println("Course ID: " + c.getCourseId());
            System.out.println("Course Name: " + c.getCourseName());
            System.out.println("Duration: " + c.getDuration() + " months");
            System.out.println("Fee: " + c.getFee());
            System.out.println();
        }

        System.out.println("Total number of courses: " + availableCourses.size());

    }

}
