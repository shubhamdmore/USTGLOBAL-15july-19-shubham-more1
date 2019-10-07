package com.dev.string;

import com.dev.methods.*;

public class MyConstructor {

	 int a , b; 
	 MyConstructor()
	 {
		 System.out.println(" Constructor call automatically");
	 }
	 MyConstructor(int x)
	 {
		 System.out.println("value of x = "+x);
	 }
	 MyConstructor(double y)
	 {
		 System.out.println("value of y = "+y);
	 }
	 MyConstructor(double  x,int y)
	 {
		 System.out.println("value of x = "+x);
		 System.out.println("value of y = "+y);
	 }
	 MyConstructor(int  x,double y)
	 {
		 System.out.println("value of x = "+x);
		 System.out.println("value of y = "+y);
	 }
	 
	 
	 MyConstructor(int x,int y)
	 {
		 a=x;
		 b=y;
		 System.out.println(a);
         System.out.println(b);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyConstructor ob = new  MyConstructor();
		 MyConstructor ob1 = new  MyConstructor(15);
		 MyConstructor ob2 = new  MyConstructor(58.36);
		 MyConstructor ob4 = new  MyConstructor(15.36,15);
		 MyConstructor ob5 = new  MyConstructor(15,15.69);
		 MyConstructor ob6 = new  MyConstructor(5,10);
		 
		 double l=MethodExample.circlearea(9);
		 
	}

}
