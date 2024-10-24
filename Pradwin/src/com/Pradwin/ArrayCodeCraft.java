package com.Pradwin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCodeCraft {
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {5, 2,1, 9,2, 1, 7, 6};
        List<Integer> uniqueList = new ArrayList<>();

        // Iterate through the original array
        for (int num : numbers) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Convert the List back to an array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }
//        if (uniqueArray.length == 2) {
//            // Sort the array in ascending order
//            Arrays.sort(uniqueArray);
//
//            // Print the minimum and maximum
//            System.out.println("Minimum: " + uniqueArray[0]);
//            System.out.println("Maximum: " + uniqueArray[1]);
//        }
//        else {
        	 Arrays.sort(uniqueArray);

             // Find the second minimum and second maximum
             int secondMin = uniqueArray[1]; // The element at index 1 is the second minimum
             int secondMax = uniqueArray[uniqueArray.length - 2]; // The element at the second-to-last index is the second maximum

             // Concatenate a string with the numbers
             String token="Pradwin";
             String result = ""+token+":" + secondMin + " " + secondMax;

             // Reverse the result using a StringBuilder
             StringBuilder reversedResult = new StringBuilder(result);
             reversedResult.reverse();
             System.out.println(secondMax+" "+secondMin);
             System.out.println(reversedResult.toString());
//        }
        // Sort the array in ascending order
       
        // Print the reversed result
       
    }
}
