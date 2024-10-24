package com.Pradwin;

public class ReverseArray {
	public static void main (String args[]) {
		int[] array = {1,2,3,4,5,6};
		int left = 0;
		int right = array.length-1 ;
		int temp;
		while(left<right) {
		temp = array[left];
		array[left] = array[right];
		array[right] = temp;
		left ++;
		right --;
	}
		for (int i :array) {
			System.out.print(i);
		}
	}
}
