package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner;


@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Invalid age! Age must be between 0 and 150.");
            }

            System.out.println("Your age is valid: " + age);
        
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

