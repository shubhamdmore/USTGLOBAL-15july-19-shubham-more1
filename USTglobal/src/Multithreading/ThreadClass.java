package Multithreading;

public class ThreadClass extends Thread{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ThreadClass obj =  new ThreadClass();
		Thread.currentThread().setPriority(10);
        obj.start();
       // obj.run();
        ThreadClass obj1 =  new ThreadClass();
        Thread.currentThread().setPriority(1);
        obj1.start();
	}
	
	public void run()
	{
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread priority :"+Thread.currentThread().getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("i = "+i);
		}
	}

}
