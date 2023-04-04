
public class fristRecursion 
{
	public static void printNum(int n) {
		
	if(n==0) {
		return; // base case
	}
		System.out.println(n);// print
		printNum(n-1);// recursion
	
}
	public static void main(String []args)
	{
		int n=5;
		printNum(n); //n=5
	}

}
