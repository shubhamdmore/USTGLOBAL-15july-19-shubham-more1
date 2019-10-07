package com.dev.collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayList();
      //  linkedList();
       // vector();



	}
	static void arrayList()
	{
		List<String> list=new ArrayList<String>();
		list.add("1 -->shubham");
		list.add("2 -->rohan");
		list.add("3 -->ganesh");
		list.add("4 -->mahesh");
		list.add("5-->shubham");
		
		list.add(null);
		//list.clear();

		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
	}
	
	
	
}
