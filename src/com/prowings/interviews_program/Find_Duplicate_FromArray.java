package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_FromArray {

	public static void main(String[] args) {

		Integer a[] = { 10, 20, 30, 40, 50, 20, 30, 40, 60 };
		List<Integer> list = Arrays.asList(a);

//		Set set = new HashSet();
//		list.stream().filter(i -> !set.add(i)).forEach(System.out::println);
		
		
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		collect.entrySet().stream().filter(i -> i.getValue() >1).forEach(System.out::println);
		
	}
}