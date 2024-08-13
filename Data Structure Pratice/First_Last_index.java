import java.util.Scanner;

public class First_Last_index {
	
	public static int[] searchRange(int[] a, int target)
	{
		int l = 0, h = a.length - 1, mid = 0;
		int[] res = {-1, -1};
		
		while (l <= h)
		{
			mid = (l + h) / 2;
			if (target == a[mid]) {
				res[0] = mid;
				h = mid - 1;
			} 
			else if (a[mid] < target) 
			{
				l = mid + 1;
			} 
			else 
			{
				h = mid - 1;
			}
		}
		l = 0;
		h = a.length - 1;
		while (l <= h) 
		{
			mid = (l + h) / 2;
			if (target == a[mid]) 
			{
				res[1] = mid;
				l = mid + 1;
			} 
			else if (a[mid] < target) 
			{
				l = mid + 1;
			} 
			else 
			{
				h = mid - 1;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] a = {5, 7, 7, 8, 8, 10};
		int target = 8;
		
		int[] result = searchRange(a, target);
		System.out.println("First and Last Occurrence of " + target + ": [" + result[0] + ", " + result[1] + "]");
		
		in.close();
	}
}

