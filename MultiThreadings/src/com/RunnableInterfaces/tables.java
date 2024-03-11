package com.RunnableInterfaces;

public class tables {

	public static void main(String[] args) throws InterruptedException {
		runtables sj = new runtables();
		Thread st = new Thread(sj);
		st.start();
		
		int num = 15;
		int table = 0;
		for(int i=1; i<=10; i++) {
			table = num*i;
			System.out.println(num+"*"+i+"="+table);
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}

	}

}
class runtables implements Runnable{

	@Override
	public void run() {
		int num = 18;
		int table = 0;
		for(int i=1; i<=10; i++) {
			table = num*i;
			System.out.println(num+"*"+i+"="+table);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(950);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
