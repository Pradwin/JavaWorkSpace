package com.Pradwin;

public class Fibo {
	public static void main(String args[]) {
		int n= 7;
		int first = 0;
		int second = 1;
		while (n != 0){
			System.out.println(first+" ");
			int next = first + second;
			first = second;
			second = next;
			n--;
		}
	}
}
