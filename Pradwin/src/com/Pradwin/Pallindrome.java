package com.Pradwin;

public class Pallindrome {
	public static void main(String args[]) {
		String input = "A man, a plan";
		String cleaned = input.toLowerCase().replaceAll("\s|,","");
		int left = 0;
		int right = cleaned.length()-1;
		while(left<right) {
			if (cleaned.charAt(left) == cleaned.charAt(right)) {
				left ++;
				right --;
			}
			else {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("Is a palindrome");
	}
}
