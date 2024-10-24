package com.Pradwin;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistinctYear {
	public static void main(String[] args) {
        String inputSentence = "I was born in 1990 and graduated in 2010. The year 1990 was a memorable one.";

        Set<Integer> distinctYears = new HashSet<>();
        
        // Define a regular expression pattern to match 4-digit years
        Pattern pattern = Pattern.compile("\\b\\d{4}\\b"); // Matches 4-digit numbers

        Matcher matcher = pattern.matcher(inputSentence);

        while (matcher.find()) {
            int year = Integer.parseInt(matcher.group());
            distinctYears.add(year);
        }

        System.out.println("Distinct years found in the sentence:");
        for (int year : distinctYears) {
            System.out.println(year);
        }
    }
}
