package com.prowings;

public interface ADemo {

	public static void main(String[] args) {
		A a=() -> System.out.println("hello");
		a.show();
	}
}
