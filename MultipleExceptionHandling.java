package com.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            
            if (num == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int result = 100 / num;
            System.out.println("Result: " + result);
        
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}