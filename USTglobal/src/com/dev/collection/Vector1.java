package com.dev.collection;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new Vector<String>();
		
		l.add("shubham");
		l.add("rohan");
		l.add("ganesh");
		l.add("avi");
		l.add("vaibhav");
		l.remove(2);
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
