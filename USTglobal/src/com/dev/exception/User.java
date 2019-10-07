package com.dev.exception;
import java.util.*;
public class User extends UserDefinedException {

	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
	 check();
		

	}
	public static void  check () throws UserDefinedException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a and b");
		int a= sc.nextInt();
		int b = sc.nextInt();
		try
		{
			int c= a/b;
			System.out.println("no problem ans = "+c);
		}
		catch(Exception e)
		{
			throw new UserDefinedException();
		}
	}

}
