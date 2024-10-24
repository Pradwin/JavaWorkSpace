package com.Pradwin;

import java.util.ArrayList;

public class removeDuplicate {
	public static void main (String args[]) {
		int[] arr1 = {1,2,4,4,5,6,6,8,9,0};
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i=0;i<arr1.length;i++) {
			if (!array.contains(arr1[i])) {
				array.add(arr1[i]);
			}
		}
		for(Integer i:array) {
			System.out.println(i);
		}
	}
}
