package com.prowings;

import java.util.function.Consumer;

public class ConsImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}
