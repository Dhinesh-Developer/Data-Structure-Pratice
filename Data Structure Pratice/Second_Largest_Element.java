import java.util.Scanner;

public class Second_Largest_Element {
	
	static int secondLargest(int[] a)
	{
		int max1 = 0, max2 = 0;
		if(max1 >a[0])
		{
			max1 = a[0];
			max2 = a[1];
		}
		else
		{
			max2 = a[0];
			max1 = a[1];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max1)
			{
				max2 = max1;
				max1 = a[i];
				
			}
			else if(a[i] > max2)
			{
				max2 = a[i];
			}
		}
		return max2;
	}

	public static void main(String[] args) {


		/*
		 * Given a array a.write a program to find the second largest element in the array.
		 * 
		 * input = {20,42,6,25,30,88} output = 42.
		 */
		Scanner in = new Scanner(System.in);
		int[] a = {20,42,6,25,30,88};
		 int res = secondLargest(a);
		 System.out.println(res);

	}

}
