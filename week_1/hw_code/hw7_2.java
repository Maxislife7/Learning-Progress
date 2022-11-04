package hello;

import java.util.Scanner;

public class hw7_2 {
	
	public static boolean full(int i)
	{
		boolean full=false;
		int sum=0;
		for (int j=1; j<i; j++)
		{
			if (i%j==0)
			{
				sum+=j;
			}
				
		}
		if (sum == i)
		{
			full=true;
		}
		return full;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = n; i<m;i++)
		{
			if (full(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
