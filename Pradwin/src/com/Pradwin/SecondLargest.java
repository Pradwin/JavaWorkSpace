package com.Pradwin;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String args[]) {
		int[] array = {2,6,4,9,8,5,1};
		Arrays.sort(array);
		System.out.println(array[array.length-2]);
	}
}
