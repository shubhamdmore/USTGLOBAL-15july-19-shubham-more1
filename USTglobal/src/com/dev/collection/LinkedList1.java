package com.dev.collection;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList();
	}

	static void LinkedList()
	{
		List<String> list=new LinkedList<String>();
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
	}
}
