package Array;

import java.util.Scanner;

public class program2 {
	
	public static boolean checkIfArrayIsSorted(int[] ar)
	{
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i] >= ar[i-1])
			{
				
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * write a program to check if the array is sorted .use boolean datatype.
		 * input = 5   1 2 3 4 5    true.       input = 5   1 2 1 3 4     output = false
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		boolean x = checkIfArrayIsSorted(ar);
		System.out.println(x);
	}

}
