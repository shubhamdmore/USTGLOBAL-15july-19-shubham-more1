package com.dev.collection;

import java.util.HashMap;
import java.util.TreeSet;

import com.dev.collection.Employee;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Employee> hm = new HashMap<String , Employee>();

		Employee obj = new Employee();
		obj.setId(1);
		obj.setName("mahesh");
		obj.setEmail("mahesh321@gmail.com");

		Employee obj1 = new Employee();
		obj1.setId(1);
		obj1.setName("mahesh");
		obj1.setEmail("mahesh321@gmail.com");

		Employee obj2 = new Employee();
		obj2.setId(1);
		obj2.setName("mahesh");
		obj2.setEmail("mahesh321@gmail.com");

		//hm.put("1", obj);
		//Employee b =	hm.put("1", obj1);
		//System.out.println(b);

		hm.put("1", obj);
		hm.put("2", obj1);
		hm.put("3", obj2);

		System.out.println(hm);

		Employee e = hm.remove("1");
		System.out.println(e);
		System.out.println(hm);
		
		System.out.println("output of containsKey = : "+hm.containsKey("2"));
		
		System.out.println("output of containsKey = : "+hm.containsKey("8"));	
 

	}

}
