package com.dev.thread;

public class T3 extends Thread{
	public void run()
	{
		System.out.println("This is T3 thread started");
		for(int i= 1;i<=10;i++)
		{
			
			System.out.println("i = "+i);
//			try {
//				Thread.currentThread().sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("This is T3 thread end");
	}

}
