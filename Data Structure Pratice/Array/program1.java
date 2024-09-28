package Array;

import java.util.Scanner;

public class program1 {

	// Better approach time complexity = O(n)
	// if array contains negative number take smallest  = MIN_VALUE
	public static void secondLargestElement(int[] ar)
	{
		int largest = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > largest)
			{
				largest = ar[i];
			}
		}

		int smallest = -1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > smallest && ar[i] != largest)
			{
				smallest = ar[i];
			}
		}
		System.out.println(smallest);
	}

	
	
	// optimal approach.
	public static void secondLargestElement1(int []ar)
	{
		int largest = ar[0];
		int smallest = -1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] > largest)
			{
				smallest = largest;
				largest = ar[i];
			}
			else if(ar[i] < largest && ar[i] > smallest)
			{
				smallest = ar[i];
			}
		}
		System.out.println(smallest);
		
	}

	public static void main(String[] args) {
		
		/*
		 * write a program to print the second  largest element in the array.\
		 * input = 5   1 2 4 7 5    output = 5
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		secondLargestElement1(ar);
	}

}
