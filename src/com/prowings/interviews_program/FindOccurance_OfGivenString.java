package com.prowings.interviews_program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurance_OfGivenString {

	public static void main(String[] args) {
													
		String s = "komalhgkomalgfkomalgdfkomalhdg";
		String searchString = "komal";
										
		countOccurrences(s, searchString);

	}

	public static void countOccurrences(String mainString, String searchString) {
		Pattern pattern = Pattern.compile(searchString);
		Matcher matcher = pattern.matcher(mainString);

		int count=0;
		while(matcher.find()) {
			count++;
		}
		System.out.println("Occurance of "+searchString + " is "+ count ); 

	}

}
