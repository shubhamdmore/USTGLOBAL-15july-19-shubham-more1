package com.dev.myinterface;

public class E implements Interface1{



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E obj =new E();
		obj.display();
	}

	@Override
	public	void display()
	{
       System.out.println("this is display method");
	}
}
