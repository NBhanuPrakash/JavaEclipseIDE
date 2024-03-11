package com.functions;

import java.util.function.Function;

public class FunctionsExample {
	public static void main(String[] args) {
		Function<String, Integer> stFunction = (s) ->{
			return s.length();
		};
		Integer numberLength =stFunction.apply("Bhanu");
		System.out.println(numberLength);
	}

}
