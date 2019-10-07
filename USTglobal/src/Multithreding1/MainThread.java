package Multithreding1;

public class MainThread extends Thread {

	 public static void main(String[] args) throws InterruptedException {

		// T1 obj2 = new T1();
		// obj2.setPriority(5);
		// obj2.start();

		MainThread obj1 = new MainThread();
		obj1.setPriority(1);
		obj1.start();

		MainThread obj11 = new MainThread();
		obj11.setPriority(10);
		obj11.start();

		T2 obj3 = new T2();
		obj3.setPriority(1);
		obj3.start();

	}

	@Override
	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName());
		for (int i = 1; i < 4; i++) {
			System.out.println("main Thread i =" + i);
		}
	}

}
