package com.Pradwin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Repeat {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the vector
        System.out.print("Enter the number of elements in the vector: ");
        int n = scanner.nextInt();

        Vector<Integer> vector = new Vector<>();

        // Prompt the user to enter the elements of the vector
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            vector.add(scanner.nextInt());
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each element using a HashMap
        for (int num : vector) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating element
        int nonRepeatingElement = -1;
        for (int num : vector) {
            if (frequencyMap.get(num) == 1) {
                nonRepeatingElement = num;
                break;
            }
        }

        // Print the result
        if (nonRepeatingElement != -1) {
            System.out.println("First non-repeating element: " + nonRepeatingElement);
        } else {
            System.out.println("No non-repeating element found.");
        }

        scanner.close();
    }
}
