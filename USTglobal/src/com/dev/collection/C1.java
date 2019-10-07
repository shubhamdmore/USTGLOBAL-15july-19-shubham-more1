package com.dev.collection;

import java.util.HashSet;
import java.util.Iterator;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<String> list1 = new HashSet<String>();
	
	list1.add("hp");
	list1.add("dell");
	list1.add("acer");
	
	list1.remove("dell");
   // list1.clear();	
	 Iterator<String> itr=list1.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		System.out.println(list1);
		boolean b = list1.contains(list1);
		System.out.println(b);
	
		System.out.println(list1.isEmpty());
	
	}

}
