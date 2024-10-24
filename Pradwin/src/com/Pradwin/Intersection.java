package com.Pradwin;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {3,4,5,6,7};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int left=0,right=0;
		while(left < num1.length && right < num2.length) {
			if(num1[left] == num2[right]) {
				arr.add(num1[left]);
				left++;
				right++;
			}
			else {
				left++;
			}
		}
		for(Integer i:arr) {
			System.out.println(i);
		}
	}

}
