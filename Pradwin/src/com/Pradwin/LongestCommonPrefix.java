package com.Pradwin;

public class LongestCommonPrefix {

    // Method to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as a reference
        String prefix = strs[0];
        
        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        
        // Find and print the longest common prefix
        String result = longestCommonPrefix(strings);
        System.out.println("Longest common prefix: " + result);
    }
}
