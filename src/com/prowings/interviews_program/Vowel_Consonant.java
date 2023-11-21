package com.prowings.interviews_program;

import java.util.Arrays;
import java.util.List;

public class Vowel_Consonant {

	public static void main(String[] args) {

		String s = "I Love India";

		List<Character> ch = Arrays.asList('a', 'e', 'i', 'o', 'u');

		long vowelCount = s.chars().mapToObj(c -> (char) c)
		.filter(Character::isLetter)
		.filter(c -> ch.contains(Character.toLowerCase(c)))
		.count();

		
		long ConsonantCount=s.chars().mapToObj(c -> (char) c)
		.filter(Character::isLetter)
		.filter(c -> !ch.contains(Character.toLowerCase(c)))
		.count();
		
		System.out.println("Vowels Count :"+vowelCount);
		System.out.println("Consonant Count :"+ConsonantCount);
	}
}
