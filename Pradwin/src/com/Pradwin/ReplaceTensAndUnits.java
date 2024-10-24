package com.Pradwin;

import java.util.Scanner;

public class ReplaceTensAndUnits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int length=String.valueOf(input).length();
        if(length==3) {
        	int hundredsDigit = input / 100; 
        	int newNumber = hundredsDigit * 100; 	
        	System.out.println("Number with replaced tens and units places: " + newNumber);
        }
        else if(length==4) {
        	int ThousandsDigit = input / 1000; 
        	int newNumber = ThousandsDigit * 1000; 	
        	System.out.println("Number with replaced tens and units places: " + newNumber);	
        }

       

        scanner.close();
    }
}
