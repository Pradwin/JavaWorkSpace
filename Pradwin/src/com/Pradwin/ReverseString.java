package com.Pradwin;

import java.util.Scanner;

public class ReverseString {
public static void main(String args[]) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter your name");
	String s1=in.nextLine();
	rev(s1);
	in.close();
}
public static void rev(String s1) {
	int l=s1.length();
	int i=l,j=l-1;
	while(j>=0) {
		String s2 = s1.substring(j,i);
		System.out.print(s2);
		i--;
		j--;
	}
}
}
