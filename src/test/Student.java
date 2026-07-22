package test;

public class Student {
	int studentId;
    String studentName;
    String course;
    public void setDetails(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }
    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("ID      : " + studentId);
        System.out.println("Name    : " + studentName);
        System.out.println("Course  : " + course);
    }

	public static void main(String[] args) {
		 Student s = new Student();
	        s.setDetails(101, "Ravi", "Java Full Stack");
	        s.displayDetails();
	}

}
