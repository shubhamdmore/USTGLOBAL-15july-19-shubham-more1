package com.dev.multitreading;

public class TreadClass extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreadClass obj = new TreadClass();
		obj.start();
		TreadClass obj1 = new TreadClass();
		obj1.start();
        	    
		
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("thread is running  : "+Thread.currentThread().getName());
		}
		
	}
	

}
