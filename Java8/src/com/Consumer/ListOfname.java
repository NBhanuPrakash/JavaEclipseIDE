package com.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListOfname {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Bhanu","Prakash","Jaya","Mohan","Ravi tej");
		Consumer<List<String>> consumer = (s) ->{			
			s.stream().filter(name ->name.length()%2==0).forEach(System.out::println);
		};
		consumer.accept(nameList);
	}





}
