package april;

public class mainMethodOverloadAreNot 
{
	public static void main(String []args)
	{
		System.out.println("main method ");
	}
	public static void main(Integer []args)
	{
		System.out.println("overloaded interger");
	}
	public static void main(Character []args)
	{
		System.out.println("overload charcter");
	}

}
