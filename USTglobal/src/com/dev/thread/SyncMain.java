package com.dev.thread;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		new Thread4(p).start();
		

	}
	public void run()
	{
		System.out.println("Sync Main statted");
		for(int i= 1;i<=10;i++)
		{
			System.out.println("j = "+i);
		}
		System.out.println(" Sync main  end");
	}

}
