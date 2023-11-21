package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class Highest_Repeatative_Element {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 1 };

		Optional<Integer> max = Arrays.asList(a).stream()
				.max(Comparator.comparingInt(i -> Collections.frequency(Arrays.asList(a), i)));
		System.out.println(max);

	}

}