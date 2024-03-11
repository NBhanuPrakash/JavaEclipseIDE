package com.interfacee;

public class Booking implements inter,Reserv  {
	public static void main(String[] args) {
		Booking bk = new Booking();
		bk.booking();
		bk.reserve();
		bk.book(58);
		bk.Sim();
	}

	@Override
	public void booking() {
		System.out.println("Enter the Name:");
		
		
	}

	@Override
	public int reserve() {
		System.out.println("Enter the Reservation Number:");
		return 0;
	}

	@Override
	public int book(int bha) {
		System.out.println("Enter the child class:"+bha);
		return bha;
	}
		

	
		
	

}
