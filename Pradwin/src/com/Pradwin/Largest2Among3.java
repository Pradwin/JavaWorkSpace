package com.Pradwin;

import java.util.Scanner;

public class Largest2Among3 {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a three-digit number
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the input number is a three-digit number
        if (number >= 100 && number <= 999) {
            // Extract the digits of the number
            int digit1 = number / 100;
            int digit2 = (number / 10) % 10;
            int digit3 = number % 10;

            // Find the largest two-digit value
            int largestTwoDigitValue = Math.max(Math.max(digit1 * 10 + digit2, digit1 * 10 + digit3), digit2 * 10 + digit3);

            // Output the largest two-digit value
            System.out.println("The largest two-digit value in " + number + " is: " + largestTwoDigitValue);
        } else {
            // Invalid input if it's not a three-digit number
            System.out.println("Invalid input. Please enter a three-digit number.");
        }
    }
}
