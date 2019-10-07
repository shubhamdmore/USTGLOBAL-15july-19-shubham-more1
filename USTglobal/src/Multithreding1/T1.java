package Multithreding1;

 public class T1 extends Thread {
	@Override
	public void run() {
		System.out.println("this is T1 thread");
		for (int i = 1; i < 4; i++) {
			System.out.println(" Thread T1 j =" + i);
		}
	}
}
