package com.Pradwin;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "hello";
		Map<Character,Integer> test = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < name.length(); i ++) {
			if (!test.containsKey(name.charAt(i))){
				test.put(name.charAt(i), 1 );
			}
			else {
				int val = test.get(name.charAt(i)) + 1;
				test.replace(name.charAt(i), val);
			}
		}
		for(Entry<Character, Integer> i : test.entrySet()) {
			System.out.println(i.getKey()+ " "+i.getValue());
		}
	}

}
