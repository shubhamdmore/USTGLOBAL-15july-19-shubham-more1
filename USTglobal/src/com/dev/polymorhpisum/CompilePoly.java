package com.dev.polymorhpisum;

public class CompilePoly {

	
	void add(int x , int y)
	{
		System.out.println("addition of a and b = "+ (x+y));
	}
	void add(int x , int y ,int z)
	{
		System.out.println("addition of a and b = "+ (x+y+z));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompilePoly obj = new CompilePoly();
		obj.add(5, 5);
		obj.add(5, 5, 5);
	}

}
