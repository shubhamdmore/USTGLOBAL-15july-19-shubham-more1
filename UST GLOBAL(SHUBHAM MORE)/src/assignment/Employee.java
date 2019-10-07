package assignment;

class Employee {
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", sal=" + sal + ", passwod="
				+ passwod + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getPasswod() {
		return passwod;
	}
	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}
	private int empid;
	private String name;
	private String email;
	private double sal;
	private String passwod;

}
