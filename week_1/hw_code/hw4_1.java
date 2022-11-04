package hello;

import java.util.Scanner;

public class hw4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int sum_x=0;
		int sum_y=0;
		// calculate the sum of the m number of prime number,
		// 		use count to count the number of prime numbers, if count = m, then break
		//		use for loop to find the sum
		// then calculate the sum of the n-1 number of prime numbers
		//return the difference;
		int count_x=0;
		for (int x = 2; count_x<m;x++)
		{
			int isPrime =1;
			for (int i = 2; i<x; i++)
			{
				if (x%i == 0 )
				{
					isPrime=0;
					break;
				}
			}
			if (isPrime==1)
			{
				sum_x= sum_x+x;
				count_x+=1;
			}
		}
		
		int count_y=0;
		for (int y = 2; count_y<n-1;y++)
		{
			int isPrime =1;
			for (int i = 2; i<y; i++)
			{
				if (y%i == 0 )
				{
					isPrime=0;
					break;
				}
			}
			if (isPrime==1)
			{
				sum_y=sum_y+y;
				count_y+=1;
			}
		}
		System.out.println((sum_x-sum_y));
		
	}

}
