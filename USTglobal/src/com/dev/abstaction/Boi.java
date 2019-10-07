package com.dev.abstaction;

public class Boi extends Bom{

	void rateOfIntrest()
	{
	   System.out.println("rate of intrest of Bom is  = 3");	
	}
	public static void main(String[] args)
	{
		Boi obj = new Boi();
		obj.display();
		obj.rateOfIntrest();
	}
}
