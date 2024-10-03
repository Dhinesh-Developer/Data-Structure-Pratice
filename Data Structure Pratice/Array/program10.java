package Array;

public class program10 {
	public static int maximumConsecutiveOne(int[] ar,int n)
	{
		int count =0;
		int max = 0;
		for(int i=0;i<n;i++)
		{
			if(ar[i] == 1)
			{
				count++;
				max = max(max,count);
			}
			else
			{
				count =0;
			}
		}
		return max;
	}

	public static int max(int max,int count)
	{
		if(max>count)
		{
			return max;
		}
		if(max<count ){
			return count;
		}
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * Given an array that contains only one and zero,return the count of maximum consective
		 * ones in the array.
		 * output = The maximum consective ones are :3
		 */

		int n = 9;
		int[] ar = {1,1,0,1,1,1,0,1,1};
		int res = maximumConsecutiveOne(ar,n);
		System.out.println("The maximum consective ones are :"+res);
	}

}
