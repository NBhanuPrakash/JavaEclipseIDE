package com.deadlock;

public class unstopbleCode {
	public static void main(String[] args) throws Exception {
		Sum1  t1 = new Sum1();
		Sum2 t2 = new Sum2();
		t1.Sum2=t1;
		t2.Sum1=t2;
		t1.start();
		
		
		
		
		
	}

}
class Sum1 extends Thread{
	
	public Sum1 Sum2;
	
	int sum =0;
	@Override
	public void run() {
	for(int i=1; i<=100; i++) {
		sum=sum+i;
		try {
			Thread.sleep(150);
			Sum2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println(sum);
	}
	}
	
}
class Sum2 extends Thread{
	
	public Sum2 Sum1;
	
	int sum=0;
	@Override
	public void run() {
	for(int i=1; i<=100; i++) {
		sum=sum+i;
		try {
			Thread.sleep(150);
			Sum1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		
	}
	}
	

	
}

