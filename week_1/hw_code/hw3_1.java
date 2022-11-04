package hello;

import java.util.Scanner;

public class hw3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int even = 0;
		int odd = 0;
		do
		{
			num = in.nextInt();
			if (num != -1)
			{
				if (num % 2 == 0)
				{
					even +=1;
				}
				else
				{
					odd += 1;
				}
			}
		} while (num != -1);
		System.out.println(odd+" "+even);		
	}

}
