package april;

import java.util.Arrays;

public class Fillanemptyarray 
{
	public static void main(String[] args) {
		int[] values = new int[10];
		Arrays.fill(values, 5);
		for (int value : values) {
			System.out.print(value);
			System.out.print(' ');
		}
	}
}
