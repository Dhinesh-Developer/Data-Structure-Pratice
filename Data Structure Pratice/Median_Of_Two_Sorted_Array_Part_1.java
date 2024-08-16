
public class Median_Of_Two_Sorted_Array_Part_1 {
	
	public static float findMedian(int[] ar1,int[] ar2)
	{
		int i=0,j=0,k=0;
		int[] m = new int[ar1.length+ar2.length];
		while(i < ar1.length && i< ar2.length)
		{
			if(ar1[i] < ar2[j])
			{
				m[k] = ar1[i];
				i++;
				k++;
			}
			else {
				m[k] = ar1[j];
				j++;
				k++;	
			}
		}
		while(i < ar1.length)
		{
			m[k] = ar1[i];
			i++;
			k++;
		}
		while(j < ar2.length)
		{
			m[k] = ar2[j];
			j++;
			k++;
		}
		if(m.length % 2==0)
		{
			int mid = m.length/2;
			return (float)(m[mid] + m[mid-1])/2;
		}
		else {
			int mid = m.length/2;
			return (float)(m[mid]);
		}
		
	}

	public static void main(String[] args) {
		/*
		 * Find the median of two sorted array.  if even median = no.of elements/2   if odd median  =  mid +(mid-1)/2
		 */

		int[] ar1 = {1,3,5,7};
		int[] ar2 = {5,6,7,19,21,25};
		System.out.println( findMedian(ar1,ar2));

	}

}
