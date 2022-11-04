package hello;

import java.util.Scanner;

public class hw7_1 {
	
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for (int k=2; k<i;k++)
		{
			if (i%k==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (isPrime(num))
		{
			System.out.println(num+"="+num);
		}
		else
		{
			System.out.print(num+"=");			
			
			
			while(isPrime(num)==false)
			{
				for (int i=2; i<(num+1)/2; i++)
				{
					if (isPrime(i))
					{
						if (num%i==0)
						{
							System.out.print(i+"x");
							num /= i;
						}
					}
				}
			}
			System.out.print(num);
		}
	}

}
