package assignment;

import java.util.HashMap;

public class EmployeeMethod  implements EmployeeInterface{

	HashMap<String, Employee> hm = new HashMap<String, Employee>();
	@Override
	public boolean addEmployee(String key, Employee value) {
		if(value != null)
		{
			hm.put(key, value);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(String key) {
		hm.remove(key);
		return false;
	}

	@Override
	public void retrive() {
		
		System.out.println(hm);
	}

	@Override
	public boolean updateEmployee(String key, Employee value) {
		
		
		
		return false;
	}
	
	void calSall(int sall)

	{
		if(sall>=1000000)
		{
			System.out.println("salGrade is AA");
			float asal = (float) ((sall*9.35)/100)-5679;
	        System.out.println("anual sal = "+asal);	
	  	}
		
	}
}
