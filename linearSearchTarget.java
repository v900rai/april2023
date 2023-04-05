
public class linearSearchTarget 
{
	public static int lenearSearch(int number[], int key)
	{
		for(int i=0; i<number.length; i++)
		{
			if(number[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String []args)
	{
		int number[]= {1,2,3,4,10,11,14,15};
		int key=10;
		int index=lenearSearch(number, key);
		if(index==-1) {
			System.out.println("its not found");
		}
		else
		{
			System.out.println("its found index"+index);
		}
		
	}

}
