package com.dev.exception;

public class ExceptionExamle extends CustomException {
	
	

	public static void main(String[] args)  throws CustomException{
		// TODO Auto-generated method stub

		try
		{
			int a=10 , b=0;
			int c=a/b;
		}
		catch(Exception e)
		{
			throw new CustomException();
		}
	}
}
