package com.Pradwin;

public class StringTransform {
    public static void main(String[] args) {
        String input = "string"; // Replace with your input string
        String output = transformString(input);
        System.out.println(output); // Should print "rtsng"
    }

    public static String transformString(String input) {
        // Reverse the input string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Build the result based on characters at odd positions (1-based index)
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) { // 0-based index, so even positions in 0-based are odd in 1-based
                result.append(reversed.charAt(i));
            }
        }
        
        return result.toString();
    }
}

