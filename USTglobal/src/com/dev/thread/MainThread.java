package com.dev.thread;

public class MainThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainThread obj = new  MainThread();
		obj.start();
		Thread.currentThread().setName("main Thread");

		new ThreadT1().start();
		System.out.println("main thread is started");
		for(int i =1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("main thread is termineted");
		System.out.println("Thread name :"+ThreadT1.currentThread().getName());
		System.out.println("Thread id  :"+ThreadT1.currentThread().getId());
		
	}
	public void run()

	{
		System.out.println("this is T1 thread");
	}


}
