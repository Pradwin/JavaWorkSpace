package com.Pradwin;

public class Strognnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 50000; i++) {
			int temp = i;
			int num = i;
			int sum = 0;
			while(num > 0) {
				int rem  = num % 10;
				sum += Fact(rem);
				num = num / 10;
			}
			if(temp == sum) {
				System.out.println(temp);
			}
			}
	}
	public static int Fact(int n) {
		if(n==0 || n == 1) {
			return 1;
		}
		else {
			return n * Fact(n-1);
		}
	}

}
