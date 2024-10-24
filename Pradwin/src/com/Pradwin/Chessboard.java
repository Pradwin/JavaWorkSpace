package com.Pradwin;

public class Chessboard {
	 public static void main(String[] args) {
	        int size = 8; // Change this to the desired size of the chessboard
	        
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                // Alternate between asterisk and space based on row and column indices
	                if ((i + j) % 2 == 0) {
	                    System.out.print("|B|");
	                } else {
	                    System.out.print("|W|");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
}
