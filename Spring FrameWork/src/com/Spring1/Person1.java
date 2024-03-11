package com.Spring1;

public class Person1 implements Car {

	@Override
	public void multimedia() {

		System.out.println("My self bhanu Prakash");
		System.out.println("This is my car multimedia!!");
		System.out.println("************************************");
	}

	@Override
	public void routeMapping() {

		System.out.println("My self bhanu Prakash");
		System.out.println("This is my car Route Mapping!!");
	}
	
	Person1(){
		System.out.println("Constructor Invoked...");
	}

}
