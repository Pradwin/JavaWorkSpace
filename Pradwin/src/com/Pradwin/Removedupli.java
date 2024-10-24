package com.Pradwin;

import java.util.ArrayList;

public class Removedupli {
	public static void main(String args[] ) {
		String str = "Helllllllo";
		StringBuilder newStr = new StringBuilder();
		ArrayList<Character> arr = new ArrayList<Character>();
		for (int i = 0;i < str.length();i++) {
			if (!arr.contains(str.charAt(i))) {
				arr.add(str.charAt(i));
				newStr.append(str.charAt(i));
			}
		}
		System.out.println(newStr);
	}
}
