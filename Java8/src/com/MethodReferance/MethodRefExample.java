package com.MethodReferance;

public class MethodRefExample {
	public static void main(String[] args) {
		MethodRefExample mrdExample = new MethodRefExample();
		emp emp1 =mrdExample::examp1;//Method Instance Refarance...
		emp1.hello();
		emp emp2 =MethodRefExample::example2; // Method Static Refarnce...
		emp2.hello();
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		
		
	}
	void examp1() {
		
		System.out.println("Method Instatnce Refarance...");
		
	}
	
	static void example2() {
		System.out.println("method static refarance...");
		
	}
}
	
	interface emp {
		void hello();	
		
		
	}


