package com.Pradwin;

import java.util.Scanner;

public class WordCount {

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.trim().split("\\s+");
        return words.length;  // Return the number of words
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();  // Input sentence from user
        
        // Count and print the number of words
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        
        sc.close();
    }
}
