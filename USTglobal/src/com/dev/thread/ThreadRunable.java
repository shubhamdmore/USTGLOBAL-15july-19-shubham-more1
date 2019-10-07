package com.dev.thread;

public class ThreadRunable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunable obj = new ThreadRunable();
        Thread t = new Thread(obj);
        ThreadT1 o = new ThreadT1();
         o.start();
        t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
		
	}

}
