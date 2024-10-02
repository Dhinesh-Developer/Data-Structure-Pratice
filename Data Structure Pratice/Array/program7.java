package Array;

import java.util.Scanner;

public class program7 {
	public static int linearSearch(int[] ar,int num)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i] == num)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * Given an array of n size.and give the num.write a program to check if the num
		 * is present in the array or not.
		 * input  =  5    1 2 3 4 5    findElement = 4     output = 3 {index}
		 */
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int num = in.nextInt();
		int res = linearSearch(ar,num);
		System.out.println(res);
	}

}
