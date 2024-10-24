package com.Pradwin;

public class ReverseNum {
	public static void main (String args[]) {
		String num = "123456789";
		String newNum; 
		for (int i = num.length() - 1;i >= 0; i--) {
			System.out.print(num.charAt(i));
		}
	}
}
