package com.Pradwin;

public class Rotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        
        // Check if str2 is a rotation of str1
        boolean isRotation = isRotation(str1, str2);
        
        // Output the result
        if (isRotation) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
    }
    
    public static boolean isRotation(String str1, String str2) {
        // Check if strings are of equal length and not empty
        if (str1.length() == str2.length() && str1.length() > 0) {
            // Concatenate str1 with itself
            String concatenated = str1 + str1;
            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
        return false;
    }
}
