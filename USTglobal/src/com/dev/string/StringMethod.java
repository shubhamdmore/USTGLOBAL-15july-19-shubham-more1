package com.dev.string;

public class StringMethod {

	public static void main(String[] args) {
	String name="my name is rohan";
	String name1="mY name is rohan";
	int len = name.length();
    System.out.println("lenght of string = "+len);
    
    char[] ch =  name.toCharArray();//create character array of a string
    System.out.println(ch[1]);
    
    char k = name.charAt(4);//return the character at particular index
    System.out.println(k);
    
    boolean b = name.equals(name1);//compare 2 string if match return true else false
    System.out.println(b);
    
    boolean c = name.equalsIgnoreCase(name1);//compare 2 string but ignore case sensitive 
    System.out.println(c);	
	
    boolean d= name.contains("A");//it return true if charter found in string else false
    System.out.println(d);
	
	String e = name.replace('r', 'M');
	System.out.println(e);
	
	int f = name.indexOf('a');
	System.out.println(f);
	
	String g = name.toUpperCase();
	System.out.println(g);
	
	String h = name.substring(3);
	System.out.println(h);
	
	
	String i = name.substring(3, 7);
	System.out.println(i);
	
	String obj = new String("mystring");
	System.out.println(obj);
	
	final int f2=10;//final variable can not be reinitilize 
	
	//f2= 20;
	
	System.out.println("final varaible" +f2);
	
	StringBuffer name15 = new StringBuffer("shubham");
	 
	System.out.println(name15);
	
	StringBuilder name16 = new StringBuilder("hiiiiiiiiiiiiii");
	
	System.out.println(name16);
	
	StringBuffer myname = new StringBuffer();
	System.out.println(myname);
	
	System.out.println(name15.length());
	System.out.println(name15.capacity());
	
	int k45=100;
	System.out.println(k45);
	}

}

