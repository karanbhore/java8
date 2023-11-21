package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate_FromArray {

	public static void main(String[] args) {

		Integer a[]= {10,20,30,40,50,20,10,40};
		
		 List<Integer> collect = Arrays.asList(a).stream().collect(Collectors.toList());
	     System.out.println(collect);
		 
		 List<Integer> removeDuplicate = Arrays.asList(a).stream().filter(e -> Collections.frequency(Arrays.asList(a), e)==1).collect(Collectors.toList());
		 System.out.println(removeDuplicate);
		 
		 List<Integer> removeDuplicate2 = Arrays.asList(a).stream().distinct().collect(Collectors.toList());
		 System.out.println(removeDuplicate2);
		 
		 
	}

}
