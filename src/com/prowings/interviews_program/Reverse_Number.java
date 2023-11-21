package com.prowings.interviews_program;

public class Reverse_Number {

	public static void main(String[] args) {

		Integer num = 2345;

		String.valueOf(num).chars().mapToObj(i -> (char) i)
		.sorted((a, b) -> b - a).forEach(System.out::print);

		///////////// =========/////////////

		System.out.println();

		int remainder = 0;
		int reverse = 0;

		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse Number is :" + reverse);
	}

}
