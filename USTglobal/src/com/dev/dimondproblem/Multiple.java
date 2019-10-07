package com.dev.dimondproblem;

interface I1
{
	default void imethod1()
	{
		System.out.println("this is interface i1");
	}
}
interface I2 extends I1
{
	default void imethod1()
	{
		System.out.println("this is interface i2");
	}
}
interface I3 extends I1
{
	default void imethod1()
	{
		System.out.println("this is interface i3");
	}	
}

public class Multiple implements I3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiple obj =new Multiple();
		obj.imethod1();
	   
		
	}

}
