package test;
import java.util.Scanner;
public class File2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin@123";
        String correctPassword = "admin123";

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts--;

                if (attempts > 0) {
                    System.out.println("Invalid Credentials");
                    System.out.println("Attempts Left: " + attempts);
                } else {
                    System.out.println("Invalid Credentials");
                    System.out.println("Your account has been blocked after 3 failed attempts.");
                }
            }
        }

        sc.close();
   

	}

}
