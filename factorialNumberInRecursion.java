
public class factorialNumberInRecursion {
	public static int CalFactorial(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		int factnum=CalFactorial(n-1);
		int fact_n=n*factnum;
		return fact_n;
	}
	public static void main(String []args)
	{
		int n=5;
		int ans=CalFactorial(n);
		System.out.println(ans);
	}

}
