package Multithreading;

 public class ThreadClass1  extends Thread{

	synchronized public void run()
	{
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread priority :"+Thread.currentThread().getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("j = "+i);
		}
	}
}
