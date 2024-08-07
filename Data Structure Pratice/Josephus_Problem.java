import java.util.Scanner;

public class Josephus_Problem {
	
	static int jos(int n,int k)
	{
		if(n==1)
		{
			return 0;
		}
		return (jos(n-1,k)+k)%n;
	}

	public static void main(String[] args) {
 
		// Every Third Person will kill By the previous Person  // Recursion Method important problem
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println("The Right position of Josephus: " + jos(n,k));
		
		
		
		
		
	}

}
