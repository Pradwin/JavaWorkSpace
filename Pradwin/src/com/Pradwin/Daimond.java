package com.Pradwin;

public class Daimond {
public static void main(String args[]) {
	daim();
}
public static void daim() {
	String s1="FunWithProgramming";
	int l=s1.length();
	for(int i=0;i<l;i++) {
		for(int j=i;j<l-1;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			
		System.out.print(s1.charAt(j));
		}
		System.out.println();	
	}
	for(int i=1;i<l;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		int k=0;
		for(int j=i;j<l;j++) {
			System.out.print(s1.charAt(k));
            k++;
		}
		System.out.println();
	}
}
}
