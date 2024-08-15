import java.util.Scanner;

public class Wood_Cutting_Problem {
	
	static int finfWoodCount(int[] ht,int m)
	{
		int wc = 0;
		for(int i=0;i<ht.length;i++)
		{
			if(ht[i] > m)
			{
			  wc = wc + (ht[i]-m);
			}
		} 
		return wc;
		
	}
	
	static int machineHeight(int[] ht,int b)
	{
		int max = 0;
		for(int i=0;i<ht.length;i++)
		{
			if(ht[i] > max)
			{
				max = ht[i];
			}
		} 
		int l=0,h = max,m=0;
		
		while(l<=h)
		{
			m = (l+h)/2;
			int wc = finfWoodCount(ht,m);
			if(wc == b || l == m)
			{
				return m;
			}
			else if(wc > b)
			{
				l = m;
			}
			else {
				h = m;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	
		/*
		 * Write a program to find the correct woods if the wood cutter cuts the trees in pieces.
		 * wood cutter is the eco friendly manner.he does not cut the tree into extra pieces.
		 * given a array and the mid value. int[] h = {20,25,10,17}  b = 7   output = 15
 		 */
		
		Scanner in = new Scanner(System.in);
		int[] ht = {20,15,10,17};
		int b = 7; // b = 8 output = 14
		int res = machineHeight(ht,b);
		System.out.println(res);

	}

}
