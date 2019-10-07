package Assignment;

import java.util.HashMap;

public class EmpMethodImplementClass implements EmployeeInterface {

	HashMap<String, Employee> hm = new HashMap<String, Employee>();

	@Override
	public boolean addEmployee(String key, Employee Value) {
		if (Value !=null)
		{
			hm.put(key, Value);
			return true;
		}
		return false;
	}

	public boolean deletEmployee(String string) {
		hm.remove(string);
		return false;
	}

	@Override
	public void updateEmployee(String key, Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrive() {
	 System.out.println(hm);
		
	}

	@Override
	public boolean deletEmployee(Employee key) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
