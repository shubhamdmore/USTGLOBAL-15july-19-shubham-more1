package com.dev.exception;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      checkAge(110);
		

	}
	static void checkAge(int age){  
		if(age<18)  
			throw new ArithmeticException("Not Eligible for voting");  
		else  
			System.out.println("Eligible for voting");  
	}  

}
