import java.util.Scanner;

public class Binary_Search {
 
	static int binarySearch(int[] a,int key)
	{
		int low =0, high = a.length-1, mid = 0;
		while(low<=high)
		{
			mid = (low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key<a[mid])
			{
				high = mid-1;
				// low = low;
			}
			else {
				high = high+1;
				// high = high;
			}
		}
		return -1;
	}
	 
	
	public static void main(String[] args) {


		/*
		 * Always remember that if the array is sorted go to the binary search other wise got 
		 * the linear search for the better solution with less time complexity.
		 * 
		 * given a array a. write a program to find the number is in the array or not
		 * input = { 3,5,6,8,12,15,16,19,21} search element  15  output = 5 // index value
		 */
        
		Scanner in = new Scanner(System.in);
        int[] a = {3,5,6,8,12,15,16,19,21}; 
		int key = 15;
		int res = binarySearch(a,key);
		System.out.println(res);
		
	}

}
