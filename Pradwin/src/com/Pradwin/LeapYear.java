package com.Pradwin;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the year to check for leap year.");
	    int year = sc.nextInt();

	    System.out.println("The next 20 leap years from the given year " + year+ " are: ");
	    int count =0;
	    while(count != 20){
	    year++;
	    if((year%400==0) || (year%4==0 && year%100 != 0)){
	        System.out.println(year);
	        count++;
	    }
	    }
	    sc.close();
	}
}
