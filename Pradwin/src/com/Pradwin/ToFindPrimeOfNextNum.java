package com.Pradwin;

import java.util.Scanner;

public class ToFindPrimeOfNextNum {
	public static void main( String[] args) {
	    System.out.print("Enter a number: ");
	     Scanner key = new Scanner(System.in);
	     int in = key.nextInt();
	     int nextPrime = findNextPrime(in);
	     System.out.println("The next prime number greater than " + in + " is: " + nextPrime);
	     key.close();
	}

	public static boolean isPrime( int in) {
	    if (in < 2) return false;

	    for (int i=2; i <= Math.sqrt(in); i++){
	        if (in % i == 0){
	            return false;
	        }
	    }
	    return true;
	}
	 public static int findNextPrime(int start) {
	        int num = start + 1;
	        while (true) {
	            if (isPrime(num)) {
	                return num;
	            }
	            num++;
	        }
	    }
}
