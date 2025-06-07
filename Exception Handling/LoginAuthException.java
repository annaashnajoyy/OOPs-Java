/*
 * Experiment 21 – User-Defined Exception: Login Authentication
 * File: LoginAuthException.java
 *
 * This program defines a custom exception to handle invalid login attempts.
 * If the user enters an incorrect username or password, the exception is thrown.
 */

import java.util.Scanner;

// Custom Exception
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginAuthException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "password123";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new InvalidLoginException("Invalid Login! Username or Password is incorrect.");
            } else {
                System.out.println("Login Successful!");
            }
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
