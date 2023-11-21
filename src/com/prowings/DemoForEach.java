package com.prowings;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> c=new ConsImpl();
		
		values.stream().forEach(i -> System.out.println(i));
		values.forEach(c);
	}
}
