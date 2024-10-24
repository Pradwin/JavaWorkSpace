package com.Pradwin;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();
        
        // Initializing an empty string to store the binary result
        String binary = "";
        
        // Handle the case when the number is 0
        if (decimal == 0) {
            binary = "0";
        } else {
            // Loop to convert decimal to binary
            while (decimal > 0) {
                int remainder = decimal % 2; // Get the remainder (either 0 or 1)
                binary = remainder + binary; // Prepend the remainder to the binary string
                decimal = decimal / 2; // Update the decimal value by dividing it by 2
            }
        }
        
        System.out.println("Binary representation: " + binary);
    }
}
