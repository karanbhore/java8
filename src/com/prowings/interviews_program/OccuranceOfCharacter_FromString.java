package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacter_FromString {

	public static void main(String[] args) {

		String s = "Live In Java";
		String s1[]=s.split("");
		
		
		Map<String, Long> collect = Arrays.asList(s1).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		long count = Arrays.asList(s1).stream().filter(i -> i.equals("e")).count();
		System.out.println(count);
		
//		Map<String, Long> collect2 = Arrays.asList(s1).stream().filter(i -> i.matches("[a-z,A-Z^]")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect2);
		
		
		
		
	}
}
