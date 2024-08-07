import java.util.Scanner;

public class Recursion {
	
	static void fun(int n)
	{
		if(n<1)
		{
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	
	static void straightN(int n1)
	{
		if(n1<1)
		{
			return;
		}
		straightN(n1-1);
		System.out.println(n1-1);
	}
	
	static int factorial(int fact)
	{
		if(fact==0 || fact==1)
		{
			return 1;
		}
		return fact*factorial(fact-1);
	}
	
	static int fibo(int f)
	{
		if(f==1 || f==2)
		{
			return 1;
		}
		return fibo(f-1)+ fibo(f-2);
	}
	
	
	static int countDigits(int digit)
	{
		if(digit==0)
		{
			return 0;
		}
		return countDigits(digit/10)+1;
	}
	
	static int sumOfN(int values)
	{
		if(values==0)
		{
			return 0;
		}
		return sumOfN(values/10)+values%10;
	}
	
	 static String ReverseAString(String s,String r,int i)
	 { 
		 if(i<0)
		 {
			 return r;
		 }
		 return ReverseAString(s,r+s.charAt(i),i-1);
	 }
	
	 static boolean isPalindrome(String a,int i ,int j)
	 {
		 if(a.charAt(i) != a.charAt(j))
		 {
			 return false;
		 }
		 if(j<=i)
		 {
			 return true;
		 }
		 return isPalindrome(a,i+1,j-1);
	 }
	
	 
	  static int sumOfArray(int[] ar,int i)
	  {
		  if(i==ar.length)
		  {
			  return 0;
		  }
		  return sumOfArray(ar,i+1) + ar[i];
	  }
	
	
	
	public static void main(String[] args) {
		
		
		// print the number from 5 top 1
		
		Scanner in = new Scanner(System.in);
		
		/*
		int n= in.nextInt();
		fun(n);
		
	
		
		// print the number from 1 to 5 
		
			int n1= in.nextInt();
			straightN(n1);
			
		
		// Factorial of a given Number input 5! output 120
			
			int fact = in.nextInt();
			int res = factorial(fact);
			System.out.println(res);
			
			
		
		// Find the fibonacci series input 7 output 13
		int f = in.nextInt();
		System.out.println(fibo(f));
			
		
		
		// Count Number of Digits  input 123456 output 6
		
		int digit  = in.nextInt();
		int count  = countDigits(digit);
    	System.out.println(count);
    		
		
		// Sum of All Digits input 12345 output 15
		
		int values = in.nextInt();
		int sum = sumOfN(values);
		System.out.println(sum);
		
		
		// Reverse a String input kumar output ramuk
		
		String s = in.next();
		String r = "";
		System.out.println(ReverseAString(s,r,s.length()-1));
	
		
		// Palindrome using a Recursion input abcd o/p false i/p madam o/p true
		
	   String a  = in.next();
	   System.out.println(isPalindrome(a,0,a.length()-1));
		
			*/
		
		//Sum of all Elements in the Array. input 1234 output 10\
		int[] ar = {1,2,3,4,};	
		System.out.println(sumOfArray(ar,0));
		
		
	}

}
