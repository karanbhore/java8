package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Start_With1_FromArray {

	public static void main(String[] args) {
		
		
		Integer []a= {10,20,30,15,60,19};
		
		List<Integer> collect = Arrays.asList(a).stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(collect); 
	}
}
