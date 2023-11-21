package com.prowings.interviews_program;

import java.util.Arrays;

public class Second_HighestNumber_FromArray {

	public static void main(String[] args) {

		Integer a[]= {10,20,68,65,50,60,70};
		
		Integer integer = Arrays.asList(a).stream().sorted().distinct().skip(a.length-2).findFirst().get();
		System.out.println(integer);
		
	}

}