import java.util.Scanner;

public class Roated_Array_search_Index {
	
	public static int searchIndex(int[] a,int target)
	{
		int l=0,h = a.length-1,m=0;
		while(l<=h)
		{
			m = (l+h)/2;
			if(target == a[m])
			{
				return m;
			}
			else if(a[l] <= a[m])
			{
				if(target >=a[l] && target <a[m])
				{
					h = m-1;
				}
				else
				{
					l = m+1;
				}
			}
			else
			{
				if(target > a[m] && target <=a[h])
				{
					l= m+1;
				}
				else
				{
					h = m-1;
				}
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		/*
		 * Search in roated array. {0,1,2,3,4,5,6,7} index = 3 {4,5,6,7,0,1,2} now rotated
		 * now check the target element is presnt in the array or not.
		 * input = {4,5,6,7,0,1,2} target = 0  output = 4 //index position
		 */
	
		Scanner in = new Scanner(System.in);
       int []a = {4,5,6,7,0,1,2};
       int target = 0;  // output = 4  if target = 6  output = 2
       int res=searchIndex(a,target);
       System.out.println(res);
	}

}
