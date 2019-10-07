package com.dev.multitreading;

public class ThreadClass1 extends Thread {

	public static void main(String[] args) {
		
		ThreadClass1 obj =new ThreadClass1();
		obj.run();

	}
	public void run()
	{
		System.out.println("thread call name :"+Thread.currentThread().getName());
	}

}
