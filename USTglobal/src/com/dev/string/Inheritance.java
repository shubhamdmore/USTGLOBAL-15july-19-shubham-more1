package com.dev.string;

class Parent
{
	int k=20;
	void display() 
	{
		System.out.println("this is parent class");
	}
	Parent()
	{
		System.out.println("this is parent class constructor");
	}
}
class Child extends Parent
{
	
	int k=30;

	void fun()
	
	{
		System.out.println("this is child method");
		System.out.println(super.k);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.fun();
		

	}

}
