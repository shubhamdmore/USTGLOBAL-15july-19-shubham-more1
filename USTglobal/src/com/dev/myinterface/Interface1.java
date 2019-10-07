package com.dev.myinterface;

public interface Interface1 {

    void display();
	
    static void show()
	{
		System.out.println("this is intergace show method");
	}
    default void show1()
	{
		System.out.println("this is intergace show method");
	}
	
}
