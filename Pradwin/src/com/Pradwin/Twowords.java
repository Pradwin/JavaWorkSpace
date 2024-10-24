package com.Pradwin;

import java.util.Scanner;

public class Twowords {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split("\\s+"); // Split on whitespace

        // Print the first two words
        if (words.length >= 2) {
            System.out.println("First word: " + words[0]);
            System.out.println("Second word: " + words[1]);
        } else if (words.length == 1) {
            System.out.println("First word: " + words[0]);
            System.out.println("Only one word entered.");
        } else {
            System.out.println("No words entered.");
        }

        scanner.close();
    }
}
