package com.joinMethod;

public class tables {

	public static void main(String[] args) throws Exception  {
		 tb1 sf = new tb1();
		 sf.start();
		 
			sf.join();
		
		
		 tb2  sj = new tb2();
		 sj.start();
		 
			sj.join();
		
		 tb3 sk = new tb3();
		 sk.start();
		 
			sk.join();
		
		

	}

}

class tb1 extends Thread {
	int num = 9;
	int table = 0;

	public void run() {

		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + "*" + i + "=" + table);
			//String currentthread = Thread.currentThread().getName();
			//System.out.println(currentthread);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class tb2 extends Thread {
	int num = 10;
	int table = 0;

	public void run() {

		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + "*" + i + "=" + table);
			//String currentthread = Thread.currentThread().getName();
			//System.out.println(currentthread);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class tb3 extends Thread {
	int num = 11;
	int table = 0;

	public void run() {

		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + "*" + i + "=" + table);
			//String currentthread = Thread.currentThread().getName();
			//System.out.println(currentthread);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
