package com.dev.thread;

public class MainThreadClass extends T3 implements Runnable{

	synchronized public static void main(String[] args) {
		// TODO Auto-generated method stub
		T3 obj = new T3();
		obj.start();
		MainThreadClass o = new MainThreadClass();
        o.start();
	}
	public void run()
	{
		System.out.println("main thread statted");
		
		for(int i= 1;i<=10;i++)
		{
			System.out.println("j = "+i);
		}
		
		System.out.println("main thread end");
	}
}
