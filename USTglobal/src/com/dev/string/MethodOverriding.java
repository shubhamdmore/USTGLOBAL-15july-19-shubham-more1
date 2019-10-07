package com.dev.string;

class P //final class can not be inherted
{
	 void display()// final method can not be override
	{
		System.out.println("this is parent class method");
	}
}
class 	J extends P
{
	 void display()
	{
		System.out.println("this is Child class method");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    J obj = new J();
    obj.display();
		
	}

}
