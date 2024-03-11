package com.LinkedHasSet;

import java.util.LinkedHashSet;

public class LinkedHasSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Object> sfg = new LinkedHashSet<>();
		sfg.add("Bhanu");
		sfg.add("Bhanu");
		sfg.add("bhanu");
		sfg.add("gupiter");
		sfg.add("glipiter");
		System.out.println(sfg);
		//didn't accept Duplicates But Maintain some insertion order... 
	}

}
