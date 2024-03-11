package com.Exception;

public class Try_Catch_Example extends sectry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trycatch();
		
		
		sectrycatch();

	}

	private static void trycatch() {
		try {
			System.out.println("1");
			int num = 5 / 0;

		} catch (ArithmeticException e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
		System.out.println("4");
		System.out.println("---------------------------------------------------------------");
	}

}

class sectry extends thirdtry {
	
	protected static void sectrycatch() {
		
		
		try {
			
			System.out.println("1");
			int num = 8/0;
			System.out.println("2");
			
		}
		catch(ArithmeticException e) {
			System.out.println("3");
					
		}
		catch(Exception e) {
			System.out.println("4");
		}
		finally {
			System.out.println("5");
		}
		System.out.println("---------------------------------------------------------------");
		thirdcatch();
	}
}
class thirdtry{
	protected static void thirdcatch() {
		try {
			
			System.out.println("1");
			int num = 8/0;
			System.out.println("2");
			
		}
		catch(ArithmeticException e) {
			System.out.println("3");
			System.exit(0);
					
		}
		catch(Exception e) {
			System.out.println("4");
		}
		finally {
			System.out.println("5");
		}
		
	}
}
