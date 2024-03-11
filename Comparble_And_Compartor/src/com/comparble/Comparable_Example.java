package com.comparble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Comparable_Example {
	
	public static void main(String[] args) {
		DummyData();
		
	}
		
	
	
	public static void DummyData() {
	demo d1 = new demo("zhanu",2564,"Andhra");
	demo d2 = new demo("Ravi", 2457, "Telangana");
	demo d3 = new demo("lalith", 7458, "kerala");
	List<demo> strrD = new ArrayList<>();
	strrD.add(d3);
	strrD.add(d2);
	strrD.add(d1);
	Collections.sort(strrD);
	System.out.println(strrD);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
class demo implements Comparable<demo>{
	private String name;
	
	private int id;
	
	private String city;

	public demo() {
		super();
	}

	public demo(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "demo [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	@Override
	public int compareTo(demo namma) {
		return this.name.compareTo(namma.name);
	}
	
	
}
