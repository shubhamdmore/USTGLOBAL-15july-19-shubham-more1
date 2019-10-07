package com.dev.student;


import java.util.HashMap;

public class StudentMethodImplement implements StudentInterface {
	
	HashMap<String, Student> hm = new HashMap<String, Student>();

	@Override
	public boolean addStudent(String key, Student Value) {
		if(Value !=null)
		{
			hm.put(key, Value);
			return true;
		}
		return false;
	}

	@Override
	public boolean deletStudent(String key) {
		   hm.remove(key);
		return false;
	}

	@Override
	public void retrive() {
		// TODO Auto-generated method stub
		System.out.println(hm);
	}

	@Override
	public void updateStudent(String key, Student Value) {
		
		
	}
	

}
