package com.Pradwin;

public class ReverseS {
	public static void main(String args[]) {
		String s = "Hello";
		StringBuilder n = new StringBuilder();
		for (int i = s.length()-1 ; i >= 0; i--) {
			n.append(s.charAt(i));
		}
		System.out.println(n);
	}
}
