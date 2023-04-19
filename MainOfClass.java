package edu.jspiders.heca48.Interface3;

public class MainOfClass 
{
	public static void main(String[] args) 
	{
		Tata ta=new Tata();
		System.out.println("===tata car======");
		System.out.println(ta.colour());
		System.out.println(ta.price());	
		
		System.out.println("====kia car=====");
		
		Kia ka=new Kia();
		System.out.println(ka.colour());
		System.out.println(ka.price());	
		System.out.println("=====hyundai car====");
		
		Hyundai hu=new Hyundai();
		System.out.println(hu.colour());
		System.out.println(hu.price());	
	}

}
