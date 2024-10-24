package com.Pradwin;

import java.util.Scanner;

public class vowel {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = scanner.next();
		word.toLowerCase();
		scanner.close();
		int vowel_count = 0;
		int consonant = 0;
		for (int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			if (ch == 'a'|ch == 'e'|ch == 'i'|ch == 'o'|ch == 'u') {
				vowel_count ++;
			}
			else {
				consonant ++;
			}
		}
		System.out.println("Vowel Count: "+vowel_count+"\nConsonant Count: "+consonant);
		
	}
}
