package april;

public class findDuplicates 
{
	public static void findDuplicates(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                System.out.println("Duplicate element found: " + arr[i]);
	            }
	        }
	    }
	}

		
	
	public static void main(String []args) throws Exception
	{
		int vishal[]= {1,2,2,3,3,4,5,6,6,7,8};
		findDuplicates(vishal);
	}

}
