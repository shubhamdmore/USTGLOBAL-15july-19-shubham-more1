package com.dev.student;

public class StudentData extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentMethodImplement obj =new StudentMethodImplement();

		Student s1 = new Student();
		s1.setRoll(100);
		s1.setName("shubham");
		s1.setEmail("shubham321@gmail.com");

		Student s2 = new Student();
		s2.setRoll(200);
		s2.setName("rohan");
		s2.setEmail("rohan321@gmail.com");

		Student s3 = new Student();
		s3.setRoll(300);
		s3.setName("mahesh");
		s3.setEmail("mahesh321@gmail.com");

		boolean b1 = obj.addStudent("1", s1);
		boolean b2 = obj.addStudent("2", s2);
		boolean b3 = obj.addStudent("3", s3);

		System.out.println(b1);
		System.out.println(b2);	
		System.out.println(b3);

		obj.retrive();

		obj.addStudent("1", s1);
		obj.retrive();

		obj.deletStudent("3");
		obj.retrive();

	}

}
