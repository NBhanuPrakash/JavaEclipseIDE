package com.ExtendsThreading;

public class Tables  {

	public static void main(String[] args) throws InterruptedException {
		stable st = new stable();
		st.start();
		Tables  sh = new Tables();
		sh.table();
	}
	
	public void table() throws InterruptedException {
		int num = 8;
		int table =0;
		
		for(int i=1; i<=10; i++) {
			table=num*i;
			System.out.println(num+"*"+i+"="+table);
			String currentthread = Thread.currentThread().getName();
			System.out.println(currentthread);
			Thread.sleep(50);
		}
	}

}

class stable extends Thread {
	
	int num = 9;
	int table = 0;
	public void run() {
		
		for(int i=1; i<=10; i++) {
			table=num*i;
			System.out.println(num+"*"+i+"="+table);
			String currentthread = Thread.currentThread().getName();
			System.out.println(currentthread);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
