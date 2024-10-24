package com.Pradwin;

import java.util.Scanner;

public class LastDigitofPower {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int input1 = in.nextInt();
	        int input2 = in.nextInt();
	        LOP(input1, input2);
	        in.close();
	    }

	    public static void LOP(int input1, int input2) {
	        double result = Math.pow(input1, input2);
	        int lastDigit = (int) (result % 10);
	        System.out.print(lastDigit);
	    }
		}

