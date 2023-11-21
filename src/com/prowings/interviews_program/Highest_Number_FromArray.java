package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Highest_Number_FromArray {

	public static void main(String[] args) {
		
		Integer a[]= {10,20,30,40,50,60,70,70};
		System.out.println(a.length);
		
		Integer integer = Arrays.asList(a).stream().sorted().collect(Collectors.toList()).get(a.length-1);
		System.out.println(integer);
		
		Integer integer2 = Arrays.asList(a).stream().max((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(integer2);
		
//		Integer integer3 = Arrays.asList(a).stream().min((e1,e2) -> e1.compareTo(e2)).get();
//		System.out.println(integer3);
	}
}
