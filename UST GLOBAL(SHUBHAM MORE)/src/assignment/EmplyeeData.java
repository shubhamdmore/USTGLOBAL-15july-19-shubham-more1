package assignment;

public class EmplyeeData extends Employee {

	public static void main(String[] args) {
		
	    EmployeeMethod obj = new EmployeeMethod();
		Employee e1 = new Employee();
		e1.setEmail("shubham321@gmail.com");
		e1.setEmpid(100);
		e1.setName("shubham");
		e1.setSal(100000);
		
		Employee e2 = new Employee();
		e2.setEmail("sachin321@gmail.com");
		e2.setEmpid(200);
		e2.setName("sachin");
		e2.setSal(200000);
		
		Employee e3 = new Employee();
		e3.setEmail("arjun321@gmail.com");
		e3.setEmpid(300);
		e3.setName("arjun");
		e3.setSal(400000);
		
		Employee e4 = new Employee();
		e4.setEmail("rohan321@gmail.com");
		e4.setEmpid(400);
		e4.setName("rohan");
		e4.setSal(800000);
		
		boolean b1 = obj.addEmployee("1", e1);
		boolean b2 = obj.addEmployee("2", e2);
		boolean b3 = obj.addEmployee("3", e3);
		boolean b4 = obj.addEmployee("4", e4);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		obj.retrive();
		
		obj.deleteEmployee("1");
		obj.retrive();
		
		obj.updateEmployee("2", e1);
		obj.retrive();
	
	
		
		

	}

}
