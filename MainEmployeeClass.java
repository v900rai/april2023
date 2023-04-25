package edu.jspider.conableEmploye;

public class MainEmployeeClass 
{
	public static void main(String[] args) 
	{
		Employee E1=new Employee(111,"Sachin", 23.56);
		System.out.println(E1);	
	
	try 
	{
	Object obj=E1.clone();
	Employee E2=(Employee)obj;
	System.out.println(E2);
	}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
		
	}

    }
}
