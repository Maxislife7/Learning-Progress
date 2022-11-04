package hello;

import java.util.Scanner;

public class hw4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		// if it's negative, print fu ;
		// then set i = 100000, 
		if (num ==0)
		{
			System.out.println("ling");
		}
		if (num <0) 
		{
			System.out.print("fu ");
			num *= -1;
		}
		int place=0, i=100000,r=0;
		// find out how many digits the num has
		for (int x = num; x!=0; place++)
		{
			x /=10;
		}
		// set the denominator to the same number of digits as num
		for (int x = 6-place; x!=0; x--)
		{
			i = i/10;
		}
		while(i!=0)
		{
			r = num / i % 10;
			switch(r) {
				case 0:
					System.out.print("ling");
					break;
				case 1:
					System.out.print("yi");
					break;
				case 2:
					System.out.print("er");
					break;
				case 3:
					System.out.print("san");
					break;
				case 4:
					System.out.print("si");
					break;
				case 5:
					System.out.print("wu");
					break;
				case 6:
					System.out.print("liu");
					break;
				case 7:
					System.out.print("qi");
					break;
				case 8:
					System.out.print("ba");
					break;
				default:
					System.out.print("jiu");
					break;
			}
			if (i!=1)
			{
				System.out.print(" ");
			}
			i /=10;
		}
		
	}
}
