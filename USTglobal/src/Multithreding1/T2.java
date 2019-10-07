package Multithreding1;

public class T2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		
		System.out.println("This is Thread T2");
		for (int i = 1; i < 4; i++) {
			System.out.println(" Thread T2 k =" + i);
		}

	}

}
