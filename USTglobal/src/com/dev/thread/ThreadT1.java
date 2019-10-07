package com.dev.thread;

public class ThreadT1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ThreadT1 obj = new ThreadT1();
         obj.start();
         System.out.println("Thread id "+ThreadT1.currentThread().getId());
         System.out.println("Thread name :"+Thread.currentThread().getName());
         Thread.currentThread().setPriority(MIN_PRIORITY);
	}

	public void run()
	{
		System.out.println("another thread");
	}
}
