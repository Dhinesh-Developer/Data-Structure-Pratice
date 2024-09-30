package Array;

import java.util.Scanner;

public class program4 {
	public static void leftElementIsRoatedByOne(int[] ar)
	{
		int temp = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			ar[i-1] = ar[i];
		}
		ar[ar.length-1] = temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * given a array of n size. write a program to left rotate the element by one.
		 * input = 5   1 2 3 4 5     ouput = 2 3 4 5 1
		 * time complexity is O(n)   and space complexity is O(1)
		 */
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]  =in.nextInt();
		}
		leftElementIsRoatedByOne(ar);
				
	}

}
