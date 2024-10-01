package Array;

import java.util.Scanner;

public class program6 {
	public static int[] moveZerosToEnd(int[] ar,int n)
	{
		
		int j=-1;
		for(int  i=0;i<n;i++)
		{
			if(ar[i] == 0)
			{
				j=i;
				break;
			}
		}
		if(j == -1)
			return ar;
		for(int i = j+1;i<ar.length;i++)
		{
			if(ar[i] != 0)
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				j++;
			}
		}
		
		return ar;
	}

	public static void main(String[] args) {
		/*
		 * move all zeros to end of the array.
		 * input = 10    1 0 2 3 0 0 4 5 1     output = 1 2 3 2 4 5 1 0 0 0 
		 * time complexity
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int []ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]  =in.nextInt();
		}
		int n = ar.length;
		int[] ans = moveZerosToEnd(ar,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
