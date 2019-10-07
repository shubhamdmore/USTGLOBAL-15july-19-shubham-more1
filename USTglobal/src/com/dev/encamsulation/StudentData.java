package com.dev.encamsulation;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3= new Student();
		
		obj.setRoll(20150);
		obj.setName("shubham");
		obj.setEmail("shubhamdmore321@gmial.com");
		//obj.setPassword("Shubham@321");
		
		obj1.setRoll(20200);
		obj1.setName("rohan");
		obj1.setEmail("rohan321@gmial.com");
	//	obj.setPassword("Rohan@321");
		
		obj3.setRoll(20400);
		obj3.setName("ganesh");
		obj3.setEmail("ganesh321@gmial.com");
		//obj.setPassword("ganesh@321");
		
		obj2.setRoll(20300);
		obj2.setName("mahesh");
		obj2.setEmail("mahesh321@gmial.com");
	//	obj.setPassword("mahesh@321");
		
		System.out.println("Roll number = "+obj.getRoll());
		System.out.println("name = "+obj.getName());
		System.out.println("email id = "+obj.getEmail());
		System.out.println("**************");
		
		Student  a[] = {obj,obj1,obj2,obj3};
		
		for(int i= 0; i<a.length;i++)
		{
//			System.out.println("roll = "+a[i].getRoll());
//			System.out.println("name = "+a[i].getName());
//			System.out.println("email = "+a[i].getEmail());
			
			System.out.println(a[i]);
			System.out.println("*************");
		}
		
		System.out.println(obj.equals(obj2));
		
		
	}

}
