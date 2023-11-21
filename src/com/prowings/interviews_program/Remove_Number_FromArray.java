package com.prowings.interviews_program;

import java.util.Arrays;

public class Remove_Number_FromArray {

	public static void main(String[] args) {

		int a[] = { 5, 4, 6, 8, 7 };

		int[] array = Arrays.stream(a).filter(i -> i != 4).toArray();
		System.out.println(Arrays.toString(array));
	}

}