import java.util.Scanner;

public class powerOfN {
	
	static long pow(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		if(y%2==0)
		{
			long res = pow(x,y/2);
			return res* res;
		}
		else
		{
			return pow(x,y-1)*x;
		}
	}

	public static void main(String[] args) {
	
		// Find the power of x and y.  input = 5,8 output = 360625
		
		
		// Efficient way to find this.
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		long res = pow(x,y);
		System.out.println(res);

	}

}
