package com.Pradwin;

import java.util.HashMap;
import java.util.Map;

public class FindHightestFreq {
	public static void main(String args[]) {
		int[] array = {1,2,2,3,4,5,3,3};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i =0 ; i < array.length ; i ++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			}
			else {
				map.replace(array[i], map.get(array[i]) + 1);
			}
		}
		int maxFreq = 0;
        int mostFrequentElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        System.out.println("Element with the highest frequency: " + mostFrequentElement);
        System.out.println("Frequency: " + maxFreq);
	}
}
