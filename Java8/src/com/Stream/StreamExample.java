package com.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5,8,1,7,2,66,54,662);
		list.stream().filter(n-> n%2!=0).forEach( System.out::println);
		System.out.println("*************************************");
	}
	

}
