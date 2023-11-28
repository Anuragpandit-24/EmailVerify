package PracticeProject12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

     // Input: Email address
     System.out.print("Enter an email address: ");
     String emailAddress = scanner.nextLine();

     // Validate the email address
     if (isValidEmail(emailAddress)) {
         System.out.println("The email address is valid.");
     } else {
         System.out.println("Invalid email address format.");
     }

     // Close the scanner
     scanner.close();
 }

 // Helper method to validate an email address using a regular expression
 private static boolean isValidEmail(String email) {
     String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
     Pattern regex = Pattern.compile(emailPattern);
     Matcher matcher = regex.matcher(email);
     return matcher.matches();
    }
}
