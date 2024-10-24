package com.Pradwin;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		if (num < 1) {
			System.out.println("True");
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				System.exit(0);
			}
		}
		System.out.println("Prime");
	}

}
