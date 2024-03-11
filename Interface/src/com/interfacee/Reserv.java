package com.interfacee;


public interface Reserv {
	int reserve();
	
	default void Sim() {
		System.out.println("It's a TRIO");
		
	}

}
