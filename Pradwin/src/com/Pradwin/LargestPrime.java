package com.Pradwin;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1001;
		System.out.println(Prime(num));
	}
	
	public static int Prime(int num) {
		int val = 0;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(num % i == 0) {
				val = i;
			}
		}
		if (val == 0) {
			return num;
		}
		else {
			return val;
		}
	}

}
