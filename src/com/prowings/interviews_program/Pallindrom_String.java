package com.prowings.interviews_program;

import java.util.stream.IntStream;

public class Pallindrom_String {

	public static void main(String[] args) {
		
		String s="RADAR";
		
		boolean allMatch = IntStream.range(0, s.length()/2).allMatch(i -> s.charAt(i)==s.charAt(s.length()-i-1));
		System.out.println(allMatch);
	}
}
