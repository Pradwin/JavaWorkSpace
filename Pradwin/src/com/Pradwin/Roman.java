package com.Pradwin;

import java.util.Scanner;

public class Roman {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();

	        String romanNumeral = intToRoman(num);

	        System.out.println("Roman numeral: " + romanNumeral);

	        scanner.close();
	    }

	    public static String intToRoman(int num) {
	        String[] romanSymbols = {
	            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
	        };

	        int[] values = {
	            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
	        };

	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < values.length; i++) {
	            while (num >= values[i]) {
	                num -= values[i];
	                result.append(romanSymbols[i]);
	            }
	        }

	        return result.toString();
	    }
}
