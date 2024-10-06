package BinarySearch;

import java.util.Scanner;

public class program1 {
	
	public static int  FindXELementInArray(int[] ar,int target)
	{
		for(int i=0;i<ar.length;i++)
		{
			int low = 0,high = (ar.length-1);
			while(low <= high)
			{
				int mid = (low+high)/2;
				if(ar[mid] == target)
				{
					return mid;
				}
				else if( target>ar[mid])
				{
					low = mid+1;
				}
				else
				{
					high = mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		/*
		 * Given an array of n integers.Write a program to print the index of the target Element 
		 * present in the array index.
		 * input = 5    1 2 3 4 5    target = 2    output = 1   target = 4    output = 3
		 */
		
		Scanner in = new Scanner(System.in);
		int size  = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int target = in.nextInt();
		int res = FindXELementInArray(ar,target);
		System.out.println("The Target Element present in: "+res);
	}

}
