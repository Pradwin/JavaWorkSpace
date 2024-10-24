package com.Pradwin;
import java.util.*;

public class Hello {
 
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        ArrayList<Integer> input = new ArrayList<>();
	        System.out.println("Enter the number of elements in the vector:");
	        int n = scanner.nextInt();

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt();
	            input.add(num);
	        }

	        ArrayList<Integer> resultVector = new ArrayList<>();
	        for (Integer num : input) {
	            if (num % 2 == 0) {
	                resultVector.add(num * num);
	            }
	        }

	        Collections.sort(resultVector);

	        System.out.println("Sorted and squared even elements:");
	        for (Integer num : resultVector) {
	            System.out.println(num);
	        }
	        
	        scanner.close();
	    }
}
