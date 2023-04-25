package edu.jspider.conableEmploye;

public class Employee implements Cloneable
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override 
	protected Object clone() throws CloneNotSupportedException 
	{
		
		return super.clone();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
