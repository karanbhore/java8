package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Even_Number_fromArray {

	public static void main(String[] args) {

		Integer a[]= {11,12,13,17,7,48,56,20};
		
		List<Integer> collect = Arrays.asList(a).stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = Arrays.asList(a).stream().filter(i-> i%2 !=0).collect(Collectors.toList());
		System.out.println(collect2);
	}

}