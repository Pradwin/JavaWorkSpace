package com.Pradwin;

public class reversInt {
	public static void main (String args[]) {
		int num =1001;
		int val = 0;
		while(num != 0) {
			int rem = num % 10;
			val = val * 10 + rem;
			num = num / 10;
		}
		System.out.println(val);
	}
}
