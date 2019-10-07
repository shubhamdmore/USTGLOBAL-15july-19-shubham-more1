package com.dev.dimondproblem;

interface T1
{
	default void display()
	{
		System.out.println("we can create method in interface");
	}
}
interface T2
{
	default void display()
	{
		System.out.println("these is interface 2we can create method in interface");
	}
}

public class DimondProblem implements T1,T2 {
	
	 public void display()
	{
		T1.super.display();
		T2.super.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		DimondProblem obj = new DimondProblem();
		obj.display();
	}

}
