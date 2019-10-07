package com.dev.string;

import com.dev.methods.MethodExample;

public class mystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="shubham";
		System.out.println(name);
		
		String str1="string 1";
		System.out.println( str1);
		
		String str2;
		str2="string 2";
		System.out.println(str2);
		
		String str3=new String("string 3");
		System.out.println(str3);
		
		
		MethodExample obj1 = new MethodExample();
		obj1.add(5, 9);
	
		MethodExample.circlearea(8);
		
	}

}
