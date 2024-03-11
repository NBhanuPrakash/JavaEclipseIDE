package com.ArrayList;
import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
		al2.add("Sai");
		al2.add("Prakash");
//		al2.clear();
		
		ArrayList  al1 = new ArrayList();
		al1.add("BHanu");
		al1.add(56);
		al1.add('b');
		al1.add(13.256);
		al1.add(0,true);
		al1.addAll(al2);
		al1.remove(2);
		System.out.println(al2.contains(1)); //Check this content is available or not...
		System.out.println(al1.size());
		System.out.println(al2.get(1));
		System.out.println(al2.isEmpty()); //This object are empty or not it will check... 
		System.out.println(al1);
		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(al1.indexOf("BHanu"));
		
		
	}

}
