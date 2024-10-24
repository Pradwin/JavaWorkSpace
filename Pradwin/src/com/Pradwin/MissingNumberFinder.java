package com.Pradwin;

import java.util.Scanner;

public class MissingNumberFinder {

    // Method to find the missing number in an array
    public static int findMissingNumber(int[] array) {
        int n = array.length;
        int expectedSum = (n * (n + 1)) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;

        // Calculate the sum of the given array
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the missing number
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
