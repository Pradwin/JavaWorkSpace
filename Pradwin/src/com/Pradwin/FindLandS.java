package com.Pradwin;

import java.util.Arrays;

public class FindLandS {
	public static void main (String args[]) {
		int[] num = {1,3,4,8,9,2};
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < num.length ; i++) {
			if (num [i] >  max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
//		Arrays.sort(num);
//		System.out.println(num[0]);
//		System.out.println(num[num.length-1]);
	}
}
