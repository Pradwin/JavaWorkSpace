package com.Pradwin;

public class LongestPalindromicSubstring {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println(substring );
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        String input = "babad"; // Example string

        // Find and print the longest palindromic substring
        String result = longestPalindrome(input);
        System.out.println("The longest palindromic substring is: " + result);
    }
}
