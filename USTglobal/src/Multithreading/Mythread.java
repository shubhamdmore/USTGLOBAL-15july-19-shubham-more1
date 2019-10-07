package Multithreading;

public class Mythread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadClass obj =  new ThreadClass();
		obj.start();

		  RunnableInterface obj1 = new RunnableInterface();
				Thread t1 = new Thread(obj1);
				t1.start();

		Mythread o = new Mythread();
		o.setPriority(10);
		o.start();

		ThreadClass1 obj11 =  new ThreadClass1();
		obj11.start();

		ThreadClass1 obj111 =  new ThreadClass1();
		obj111.setPriority(1);
		obj111.start();



	}
	synchronized	public void run()
	{
		//Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread id :"+Thread.currentThread().getId());
		System.out.println("Thread priority :"+Thread.currentThread().getPriority());
		for(int i=1;i<=10;i++)
		{
			System.out.println("k = "+i);
		}
	}

}
