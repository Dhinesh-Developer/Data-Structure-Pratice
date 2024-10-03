package Array;

import java.util.Scanner;

public class program9 {

	public static int  missingNumber(int[] ar,int size)
	{
		for(int i=1;i<=size;i++)
		{
			int flag = 0;
			for(int j=0;j<size-1;j++)
			{
				if(ar[j] == i)
				{
					flag = 1;
				}
				if(flag == 0)
				{
					return i;
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		/*
		 * given an array n size. Find the missing the number in the array.
		 * n = 5    [1,2,4,5]   output =  2 index value  {missing number = 3}.
		 */
		
		Scanner in = new Scanner(System.in);
		int size = 5;
		int[] ar = {1,2,4,5};
		int res = missingNumber(ar,size);
		System.out.println("The missing number is: "+res);
	}

}
