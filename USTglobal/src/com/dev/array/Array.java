package com.dev.array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a; // declaration
		char[] b;
		byte []c;
		
		a = new int[5]; //creation
		b = new char[5];
		c = new byte[5];
		
		a[0]=10;// Initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		b[0]='A';
		b[1]='e';
		b[2]='i';
		b[3]='o';
		b[4]='u';
		
		c[0]=60;
		c[1]=80;
		c[2]=90;
		c[3]=100;
		c[4]=110;

	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(b[i]);
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(c[i]);
	 }
	 int res = a[2] * 5;
	 System.out.println(res);
	 System.out.println("length of an array"+a.length);
	}
	
	

	
}
