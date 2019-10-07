package com.dev.string;

class A {
	int a = 10;

	void show() {
		System.out.println("this is parent class");
	}

	A() {

		System.out.println("class a constructor");
	}

	A(int x)
	{
		System.out.println("vlaue of x = " + x);
	}

}

class B extends A {
	int a = 20;

	void display() {
		System.out.println("this is child class of class A");
		System.out.println("value of local variable a = " + a);
		System.out.println("value of local variable a = " + super.a);
	}

	B() {

		System.out.println("class B constructor");
	}

}

class C extends B {
	int a = 30;

	void classc() {
		System.out.println("this is child class of class B");
		System.out.println("value of local variable a = " + a);
		System.out.println("value of local variable a = " + super.a);
	}

	C() {
		System.out.println("class C constructor ");
	}

}

public class Multilevle {

	public static void main(String[] args) {

		C obj = new C();
		obj.show();
		obj.display();
		obj.classc();
	}

}
