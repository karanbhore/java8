package com.prowings;

public class LambdaDemo {

	public static void main(String[] args) {
		I obj=() -> System.out.println("hello");
		obj.show();
	}
}
