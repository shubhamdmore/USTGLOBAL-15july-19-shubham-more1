package com.dev.encamsulation;

public class BirdsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Birds obj = new Birds();
		Birds obj1 = new Birds();
		Birds obj2 = new Birds();
		Birds obj3 = new Birds();
		
		obj.setAge(1);
		obj.setColor("black");
		obj.setName("sparow");
		
		obj1.setAge(2);
		obj1.setColor("white");
		obj1.setName("crow");
		
		obj2.setAge(3);
		obj2.setColor("green");
		obj2.setName("xyz");
		
		obj3.setAge(4);
		obj3.setColor("yellow");
		obj3.setName("abc");
		
        Birds a[] = {obj,obj1, obj2,obj3,};
        for(int i =0;i<a.length;i++)
        {
        	System.out.println("age = "+a[i].getAge());
        	System.out.println("color = "+a[i].getColor());
        	System.out.println("name = "+a[i].getName());
        	System.out.println("***************************************");
        }

	}}
