package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class program8 {

	public static ArrayList<Integer> union(int[] ar1,int[] ar2)
	{
		int n1 = ar1.length;
		int n2 = ar2.length;
		HashSet <Integer> s=new HashSet<>();
		ArrayList < Integer > Union=new ArrayList<>();
		for(int i=0;i<n1;i++)
		{
			s.add(ar1[i]);
		}
		for(int i=0;i<n2;i++)
		{
			s.add(ar2[i]);
		}

		for(int x : s)
		{
			Union.add(x);
		}
		return Union;
	}

	public static void main(String[] args) {
		/*
		 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. 
		 * Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.
NOTE: Elements in the union should be in ascending order.

			input = 5   1 2 3 4 5     5    2 3 4 5 6      output = 1 2 3 4 5 6 {union}
		 */

		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int[] ar1 = new int[size1];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]= in.nextInt();
		}
		int size2 = in.nextInt();
		int[] ar2 = new int[size2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i] = in.nextInt();
		}
		ArrayList<Integer> res = union(ar1,ar2);
		for(int x : res)
		{
			System.out.println(x);
		}
		in.close();
	}

}
