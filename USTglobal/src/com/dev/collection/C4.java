package com.dev.collection;

import java.util.TreeSet;

import com.dev.collection.*;

public class C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee obj =new Employee();
		obj.setId(2);
		obj.setName("rohan");
		obj.setEmail("rohan321@gmail.com");
		obj.setPassword(123456);

		Employee obj1 =new Employee();
		obj1.setId(1);
		obj1.setName("shree");
		obj1.setEmail("shree321@gmail.com");
		obj1.setPassword(654321);

		Employee obj2 =new Employee();
		obj2.setId(3);
		obj2.setName("ganesh");
		obj2.setEmail("ganesh321@gmail.com");
		obj2.setPassword(0420);
		
	    ts.add(obj);
	    ts.add(obj1);
	    ts.add(obj2);
		System.out.println(ts);
		
		
	}

}
