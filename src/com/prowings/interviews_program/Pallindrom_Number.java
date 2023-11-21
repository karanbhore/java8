package com.prowings.interviews_program;

import java.util.stream.IntStream;

public class Pallindrom_Number {

	public static void main(String[] args) {
		
		Integer num=1221;
		String s1=num.toString();

		boolean allMatch = IntStream.range(0, s1.length()/2).allMatch(i -> s1.charAt(i)==s1.charAt(s1.length()-i-1));
		System.out.println(allMatch);
	
	}
}
