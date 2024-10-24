package com.Pradwin;

public class Armstrong {
	public static void main(String args[]) {
		int num = 9474;
		int real = num;
		int dup = num;
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count ++;
		}
		int val = 0;
		while(dup  > 0) {
			int rem = dup % 10;
			val += Math.pow(rem, count);
			dup = dup / 10;
		}
		if (real == val) {
			System.out.println("Arm");
		}
		else {
			System.out.println("Not " +real+ " "+val);
		}
	}
}
