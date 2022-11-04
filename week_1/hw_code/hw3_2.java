package hello;

import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use a while loop, use count as index, start at count =1
		// get the number by input%10, and prepare for the next loop: input = input/10
		// if count%2 == number%2, then res=1, else res=0
		// result += res*2^(count-1)
		Scanner in = new Scanner(System.in);
		int input;
		input = in.nextInt();
		int count=1;
		int res = 0;
		int result = 0;
		int digit = 0;
		do
		{
			digit = input%10;
			if (count%2 == digit%2)
			{
				res = 1;
			}
			else
			{
				res=0;
			}
			result = result + res*(int)(Math.pow(2, count-1));
			count+=1;
			input = input/10;
		} while(input>=1);
		System.out.println(result);
	}

}
