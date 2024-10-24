package com.Pradwin;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddArraySort {
	public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int[] evenArray = new int[n];
	        int[] oddArray = new int[n];

	        int evenIndex = 0;
	        int oddIndex = 0;

	        for (int num : array) {
	            if (num % 2 == 0) {
	                evenArray[evenIndex++] = num;
	            } else {
	                oddArray[oddIndex++] = num;
	            }
	        }

	        evenArray = Arrays.copyOf(evenArray, evenIndex);
	        oddArray = Arrays.copyOf(oddArray, oddIndex);

	        Arrays.sort(evenArray);
	        Arrays.sort(oddArray);

	        System.arraycopy(evenArray, 0, array, 0, evenArray.length);
	        System.arraycopy(oddArray, 0, array, evenArray.length, oddArray.length);

	        System.out.println("Sorted array with even and odd elements: " + Arrays.toString(array));

	        scanner.close();
	    }
}
