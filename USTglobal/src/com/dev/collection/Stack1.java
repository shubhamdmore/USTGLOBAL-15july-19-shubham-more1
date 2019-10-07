package com.dev.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mystack();
	}
	static void mystack()
	{
		List<String> list=new Stack<String>();
		list.add("shubham");
		list.add("rohan");
		list.add("ganesh");
		list.add("mahesh");
		list.add("shubham");
		list.add(null);
		//list.clear();
		

		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		System.out.println(list.isEmpty());
	}

}
