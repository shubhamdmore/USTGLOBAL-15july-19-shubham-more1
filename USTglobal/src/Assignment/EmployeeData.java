package Assignment;

//import java.util.HashMap;

public class EmployeeData extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<String, Employee> hm = new HashMap<String, Employee>();
		EmpMethodImplementClass obj = new EmpMethodImplementClass();

		Employee e1 =new Employee();
		e1.setId(100);
		e1.setName("shubham");
		
		Employee e2 =new Employee();
		e2.setId(200);
		e2.setName("rohan");
		
		
		boolean b = obj.addEmployee("1", e1);
		boolean b1 = obj.addEmployee("2", e2);
		System.out.println(b);
		System.out.println(b1);
		
		obj.retrive();
		
		obj.deletEmployee("1");
		obj.retrive();
		
		obj.updateEmployee("2", e1);
		obj.retrive();
		
			

	}

}
