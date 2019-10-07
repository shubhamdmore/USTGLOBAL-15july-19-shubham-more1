package Multithreading;

public class RunnableInterface implements Runnable{

	public static void main(String[] args) {
		RunnableInterface obj = new RunnableInterface();
		Thread t1 = new Thread(obj);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread priority :"+Thread.currentThread().getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("j = "+i);
		}
	}
}
