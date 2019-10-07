package com.dev.collection;

import java.util.HashSet;

import com.dev.collection.Employee;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employee> l = new HashSet<Employee>();
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

		boolean b = l.add(obj);
		boolean b1 = l.add(obj1);
		boolean b2 = l.add(obj2);

		System.out.println("output of add = "+b);
		System.out.println("output of add = "+b1);
		System.out.println("output of add = "+b2);
		System.out.println(l);

		boolean b12 = l.remove(obj);
		System.out.println(b12);
		System.out.println("output of contain()"+l.contains(obj));
	//	System.out.println("size of hashset after clear = "+l.size(obj1));
		
		


	}

}
