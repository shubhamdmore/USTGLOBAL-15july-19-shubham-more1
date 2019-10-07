package com.dev.exception;

import java.util.*;

public class ArithmeticExceptin {

	public static void main(String[] args) {

		try {
			int a;
			int b;
			int c;
			System.out.println("enter a and b");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("result  = " + c);
			System.out.println("code after exception");
		} catch (ArithmeticException e) {

			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("code after exception");
	}

}
