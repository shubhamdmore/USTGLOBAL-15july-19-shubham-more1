package com.dev.multitreading;

public class RunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface obj =new RunnableInterface();
		Thread t1 =new Thread(obj);
        t1.start();
	}

	public void run()
	{
		System.out.println("theard is calling");
	}
}
