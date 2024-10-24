package com.Pradwin;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
	public static void main(String args[])
	{
		int[] num = {1,2,3,3,4,5};
		Set<Integer> t = new HashSet<Integer>();
		for(int i = 0 ; i < num.length ; i ++) {
			t.add(num[i]);
		}
		for(Integer i : t) {
			System.out.println(i);
		}
	}
}
