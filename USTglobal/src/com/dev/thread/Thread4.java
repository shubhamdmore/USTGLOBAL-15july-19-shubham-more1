package com.dev.thread;

public class Thread4 extends Thread {
	
	Printer p;
	public Thread4(Printer pref) {
		p = pref;
	}

	public void run()
	{
		try {
			Thread.currentThread().sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.printVal(10, "thread 4");
	}

}
