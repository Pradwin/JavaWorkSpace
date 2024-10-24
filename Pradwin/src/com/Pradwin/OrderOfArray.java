package com.Pradwin;

import java.util.Scanner;

public class OrderOfArray {
 public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);

     // Prompt the user to enter the number of elements
     System.out.print("Enter the number of elements in the array: ");
     int n = scanner.nextInt();
     
     int[] array = new int[n];
     
     // Prompt the user to enter the elements of the array
     System.out.println("Enter the elements:");
     for (int i = 0; i < n; i++) {
         array[i] = scanner.nextInt();
     }
     
     boolean isIncreasing = true;
     boolean isDecreasing = true;

     // Check if the array is in increasing order
     for (int i = 1; i < n; i++) {
         if (array[i] <= array[i - 1]) {
             isIncreasing = false;
             break;
         }
     }

     // Check if the array is in decreasing order
     for (int i = 1; i < n; i++) {
         if (array[i] >= array[i - 1]) {
             isDecreasing = false;
             break;
         }
     }

     // Determine and print the order
     if (isIncreasing) {
         System.out.println("The array is in increasing order.");
     } else if (isDecreasing) {
         System.out.println("The array is in decreasing order.");
     } else {
         System.out.println("The array is neither in increasing nor in decreasing order.");
     }

     scanner.close();
 }
}
