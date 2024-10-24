package com.Pradwin;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static int perm(int n) {
		if (n==1){
			return 1;
		}
		else {
			return n*perm(n-1);
		}
	}

	public static void main(String args[]) {
		String str="EAT";
		/*List <String> list3 = new ArrayList<>();
		String s1=str.substring(0,1);
		String s2=str.substring(1,2);
		String s3=str.substring(2,3);
		list3.add(s1+s2+s3);
		list3.add(s1+s3+s2);
		list3.add(s2+s1+s3);
		list3.add(s2+s3+s1);
		list3.add(s3+s2+s1);
		list3.add(s3+s1+s2);
		System.out.println(list3);*/
		
		int l = str.length();
		int fact = perm(l);
		System.out.println(fact);
		while(fact!=0) {
			for(int i=0;i<l;i++) {
				System.out.print(str.charAt(i));
				for(int j=i+1;j<l;j++) {
					System.out.print(str.charAt(j));
					for(int k=j+1;k<l;k++) {
						System.out.print(str.charAt(k));
						
					}
					System.out.println();
				}
			}
		fact--;
		}
}
}
