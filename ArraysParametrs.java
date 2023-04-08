package ArraysAll;

public class ArraysParametrs 
{
	public static void update(int marks[])
	{
		for(int i=0; i<marks.length; i++)
		{
			marks[i]=marks[i]+2;
		}
	}
	public static void main(String []vishal)
	{
		int marks[]= {97,98,100};
		
		update(marks);
		/// printing our marks
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Update marks"+marks[i]+" ");
		}
		System.out.println();
	}

}
