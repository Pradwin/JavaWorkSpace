package com.Pradwin;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class sentToRemoveDupl {

	public static void main(String args[]) {
		Set<String> set1=new HashSet<>();
		List<String> list1=new ArrayList<>();
		//List<String> list2=new ArrayList<>();
		String str="tommorow is a ethnic ethnic day day";
		String arr[] = str.split(" ");
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);	
			set1.add(arr[i]);
		}
		System.out.println(set1);
		list1.addAll(set1);
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}
