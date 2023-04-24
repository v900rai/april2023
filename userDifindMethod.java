package april;

public class userDifindMethod 
{
	public static void findEvenAndodd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	public static void main(String []arg)
	{
		int num=24;
		findEvenAndodd(num);
	}

}
