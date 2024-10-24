package com.Pradwin;
import java.util.Scanner;

public class NumberToWords {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convert(number));
        }
    }

    private static String convert(int number) {
        if (number < 20) {
            return units[number];
        } else if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        } else {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " and " + convert(number % 100) : "");
        }
    }
}

