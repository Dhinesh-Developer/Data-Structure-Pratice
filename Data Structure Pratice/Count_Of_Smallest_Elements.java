import java.util.Scanner;

public class Count_Of_Smallest_Elements {
	
	static int countOfSmallAndEqualElements(int []ar,int key)
	{
		int l=0,h=ar.length-1,mid=0;
		while(l<=h)
		{
			mid = (l+h)/2;
			if(key == ar[mid])
			{
				while( mid+1 < ar.length &&  ar[mid+1] == key)
				{
					mid++;
				}
				break;
			}
			else if(key < ar[mid])
			{
				h = mid+1;
			}
			else
			{
				l  = mid-1;
			}
		}
		if(ar[mid] > key)
		{
			return mid;
		}
		else
		{
		  return mid+1;
		}
	}

	public static void main(String[] args) {
		
		// given a array and k values. write a program to print count of smaller or equal elements in sorted arrays.
		// input  = below here. output case1: 6 key 26  case2:6 key 26   case3:5 key 25

	
		Scanner in = new Scanner(System.in);
		int ar[] = {2,6,12,18,21,26,33,42};  // case:1  if the Elements are present in the array
	//	int ar[] = {2,6,12,18,21,26,26,26};     case:2 if duplicates are present
	//	int ar[] = {2,6,12,18,21,26,33,42};     case:3 if the searching elements are not present
		
		int key = 26;
		System.out.println(countOfSmallAndEqualElements(ar,key));
	}

}
