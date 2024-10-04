package Array;

import java.util.Scanner;

public class program11 {
	public static int getLongestSubarrayLength(int[] ar,long k)
	{
		int len = 0;
		for(int i=0;i<ar.length;i++)
		{
			long s = 0;
			for(int j=i;j<ar.length;j++)
			{
				s = s+ar[j];
				if(s == k)
				{
					len = Math.max(len, j-i+1);
				}
			}
		}
		return len;
	}
	
	public static void main(String[] args) {
		/*
		 * Given an array and a sum k,we need to print the length of the longest subarray that sums to k.
		 *output = The longest subarray length is : 3s
		 *
		 */
		
		Scanner in = new Scanner(System.in);
		int[] ar = {2,3,5,1,9};
		long k = 10;
		int res = getLongestSubarrayLength(ar,k);
		System.out.println("The longest Subarray length is: "+res);
	}

}
