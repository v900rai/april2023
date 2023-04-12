package april;

import java.util.Scanner;

public class calcualtor 
{
	public static void main(String []args)
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int cha=sc.nextInt();
		if(cha==1)
		{
			int cal=num1+num2;
			System.out.println("addition"+cal);
		}
		else if(cha==2)
		{
			int cal=num1-num2;
			System.out.println("substraction"+cal);
			
		}
		else if(cha==3)
		{
			int cal=num1%num2;
			System.out.println("reminder"+cal);
		}
		else if(cha==4)
		{
			int cal=num1*num2;
			System.out.println("Multiplication"+cal);
		}
		else if(cha==5)
		{
			int cal=num1/num2;
			System.out.println("division"+cal);
		}
		
		else
		{
			System.out.println("ivailed Syntax");
		}
	}

}
