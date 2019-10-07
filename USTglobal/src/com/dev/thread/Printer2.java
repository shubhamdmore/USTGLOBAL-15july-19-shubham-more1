package com.dev.thread;

public class Printer2 {
	
	synchronized public void printVal(int i , String thread)
	{
		for(int i1= 1;i1<=10;i1++)
		{
			System.out.println("K = "+i1);
			
		}
	}
}
