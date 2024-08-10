import java.util.Scanner;

public class Span_Array {

	static int SpanArray(int[] a)
	{
		int max = a[0];
		int min = a[0];
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else if(a[i] <min)
			{
				min = a[i];
			}
		}
		return max-min;
	}
	
	
	public static void main(String[] args) {

/*
 * 
 * given a Array a. write a program to find the sapn of the array.span means maximum value minus minimum value.
 * 
 * 
 * input = {20,42,88,10,99,62}  output = 93   // 99-6 =93
 */
		
		Scanner in = new Scanner(System.in);
		int []a = {20,42,88,10,99,6};
		int res =SpanArray(a);
		System.out.println(res);
		
		
	}

}
