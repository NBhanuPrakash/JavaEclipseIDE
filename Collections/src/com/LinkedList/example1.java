package com.LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1 {

	public static void main(String[] args) {
		LinkedList<String> st = new LinkedList<String>();
		st.add("Bhanu");
		st.add("123");
		st.add("Lion");
		st.add("fallow");
		System.out.println("Basic For Iterator...");
		for(int i=0; i<st.size(); i++) {
			System.out.println(st.get(i));
		}
		System.out.println("Basic For Each Iterator...");
		for(String str :st) {
			System.out.println(str);
		}
		System.out.println("Basic  Iterator...");
		Iterator<String> iterator = st.iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			System.out.println(string);
		}
		System.out.println("Basic List Iterator...");
		ListIterator<String> iteratorr = st.listIterator();
		while(iteratorr.hasNext()) {
			String str2 = iteratorr.next();
			System.out.println(str2);
		}
		
	}

}
