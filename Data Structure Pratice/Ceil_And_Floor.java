import java.util.Scanner;

public class Ceil_And_Floor {
	static int  ceil(int[] s,int key)
	{
		int l=0,h=s.length-1;
		int mid=0;
		while(l<=h)
		{
			mid = (l+h)/2;
			if(key==s[mid])
			{
				return s[mid];
			}
			else if(key<s[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		if(h>=0)
		{
			return s[h];
		}
		else {
			return -1;
		}
	}
	static int  floor(int[] s,int key)
	{
		int l=0,h=s.length-1;
		int mid=0;
		while(l<=h)
		{
			mid = (l+h)/2;
			if(key==s[mid])
			{
				return s[mid];
			}
			else if(key<s[mid])
			{

				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		if(l<s.length)
		{
			return s[l];
		}
		else {
			return -1;
		}
	}
	

	public static void main(String[] args) {

  /*
   * Find the ceil and floor of an sorted array.
   * input = { 19,23,56,61,72,88,92}    // if equals print same else print next greater
   * ceil(56) =56
   * ceil(68) =72
   * ceil(72) =72   
   * ceil(90) =92
   * ceil(105) = does not exist
   * 
   * Floor(56) =56             if equals print same else print Previous Smaller
   * floor(68) =61
   * floor(72) =72
   * floor(90) =88
   * floor(105) = 92
   * floor(18) =does not exist
   */
		
		Scanner in = new Scanner(System.in);
		int[] s = {19,23,56,61,72,88,92};
		
		int key = 40;
		System.out.println(ceil(s,key));
		System.out.println(floor(s,key));
		
		
		
		
		
		
		
		
	}

}
