package com.Pradwin;

public class GCD {
	public static void main(String args[]) {
		int a = 9;
		int b = 18;
		int c = Gcommon(a,b);
		System.out.println(c);
		
	}
	public static int Gcommon(int a,int b) {
		if(b == 0) {
			return a;
		}
		return Gcommon(b ,a % b);
	}
}
