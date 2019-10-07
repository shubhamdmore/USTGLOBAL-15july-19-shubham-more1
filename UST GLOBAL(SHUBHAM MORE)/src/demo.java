import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s = b;
		int i = s;
		
		System.out.println("byte ="+b);
		System.out.println("short ="+s);
		System.out.println("int ="+i);

		int i1 = 130;
		byte b1 = (byte) i1;
		System.out.println(b1);
		
		int i3 = 65;
		char c =(char) i3;
		System.out.println("Ascii value :"+c);
		
		Scanner Sc = new Scanner(System.in);
	}

}
