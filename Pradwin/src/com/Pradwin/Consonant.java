package com.Pradwin;
import java.util.*;
public class Consonant {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive count

	        int consonantCount = 0;
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if (Character.isLetter(ch) && !isVowel(ch)) {
	                consonantCount++;
	            }
	        }

	        // Print the number of consonants
	        System.out.println("Number of consonants in the sentence: " + consonantCount);

	        scanner.close();
	    }

	    public static boolean isVowel(char ch) {
	        return "aeiou".indexOf(ch) != -1;
	    }
	}
