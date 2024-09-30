package Array;

import java.util.Scanner;

public class program5 {
	public static void leftRotateAnArrayByDElements(int[] ar,int d)
	{
		int n = ar.length;
		d = d%n;
		int[] temp = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i] = ar[i];
		}
		for(int i=d;i<n;i++)
		{
			ar[i-d] = ar[i];
		}
		for(int i=0;i<d;i++)
		{
			ar[n-d+i] = temp[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * write a program to left rotate an array by d times.
		 * input = 5   1 2 3 4 5    d=2   output = 3 4 5 1 2 
		 */

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int d = in.nextInt();
		leftRotateAnArrayByDElements(ar,d);
	}

}
