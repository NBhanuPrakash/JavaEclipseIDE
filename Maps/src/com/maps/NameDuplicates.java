package com.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class NameDuplicates {
	public static void main(String[] args) {
		DuplicateAlpha();
		
		
		Set<String> sh = new LinkedHashSet<>();
		sh.add("B");
		sh.add("H");
		sh.add("A");
		sh.add("N");
		sh.add("U");
		sh.add("P");
		sh.add("R");
		sh.add("A");
		sh.add("K");
		sh.add("A");
		sh.add("S");
		sh.add("H");
		System.out.println(sh);
		
				
	}

	private static void DuplicateAlpha() {
		String name = "BhanuPrakash";
		char []array = name.toCharArray();
		Map<Character, Integer> alMap = new HashMap<>();
		for (char c : array) {
			if (alMap.get(c)==null) {
				alMap.put(c, 1);
				
				
			}
			else {
				Integer valueInteger = alMap.get(c);
				alMap.put(c,valueInteger+1);
			}
			
		}
		System.out.println(alMap);
	}

}
