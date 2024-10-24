package com.Pradwin;

import java.util.Scanner;

public class VowelOrNot {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive check

	        // Check if the string contains any vowels
	        boolean containsVowels = false;
	        for (char ch : input.toCharArray()) {
	            if ("aeiou".indexOf(ch) != -1) {
	                containsVowels = true;
	                break;
	            }
	        }

	        // Print the result
	        if (containsVowels) {
	            System.out.println("The string contains vowels.");
	        } else {
	            System.out.println("The string does not contain any vowels.");
	        }

	        scanner.close();
	    }
}
