package april;

import java.util.Scanner;

public class averageThreeNuber 
{
	public static void main(String []vishal)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the frist Number");
		double num1=sc.nextDouble();
		System.out.println("Enter the thrid number");
		double num2=sc.nextDouble();
		System.out.println("Enter the thrid Number");
		double num3=sc.nextDouble();
		System.out.println("Everage number");
		double averagenumber=calculateAverage(num1,num2,num3);
		System.out.println(averagenumber);
		
	}
	 public static double calculateAverage(double num1, double num2, double num3) {
	        double average = (num1 + num2 + num3) / 3;
	        return average;

}
}
