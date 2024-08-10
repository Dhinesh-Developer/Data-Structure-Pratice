import java.util.Scanner;

public class Linear_Search {
	
	static int LinearSearch(int []a ,int key)
	{
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int [] a = {50,40,38,40,26};
		int key = in.nextInt();
		int res= LinearSearch(a,key);
		System.out.println(res);
		

	}

}
