package com.dev.methods;


public class MethodExample {

	
	private int x=10;
	public int add(int a,int b)
	{
	    int c= a+b;
		
		System.out.println("addition = "+c);
		System.out.println(x);
		return c;
	}
	public static double circlearea(int r)
	{
		double res= 3.14*r*r;
		System.out.println("area of circle = "+res);
		return 1;
	}
	
	public static void main(String[] args) {

		
		double d= circlearea(6);
		
		MethodExample obj = new MethodExample();
		obj.add(5, 9);
	
		

	}


}
