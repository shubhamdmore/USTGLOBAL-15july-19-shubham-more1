package com.dev.string;

public class MethodOverloding {

	
	static void method()
	{
		System.out.println("This is method 1 with no argument");
	}

	static int method(int x)
	{
		System.out.println("This is method 1 with argument");
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloding.method(5);
	}

}
