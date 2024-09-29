package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class program3 {

	static void removeDuplicates(int[] ar, HashSet<Integer> set)
	{
		for(int i=0;i<ar.length;i++)
		{
			set.add(ar[i]);
		}
		for(int x : set)
		{
			System.out.println(x);
		}
	}


	public static void main(String[] args) {
		/*
		 * write a program to remove duplicates from an array.
		 * input = 10   1 2 3 2 3 4 1 5 6 3     output = 1 2 3 4 5 6  
		 */

		LinkedHashSet<Integer> set = new LinkedHashSet <Integer>();

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int []ar =new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		removeDuplicates(ar,set);


	}

}
