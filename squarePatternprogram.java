package april;

public class squarePatternprogram 
{
	public static void main(String []args)
	{
		int size=5;
		for(int row=1; row<size; row++)
		{
			for(int col=1; row<size; col++)
			{
				if(row==1 || row==size-1 || col==1 || col==size-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("   ");
				}
				System.out.println();
			}
		}
	}

}
