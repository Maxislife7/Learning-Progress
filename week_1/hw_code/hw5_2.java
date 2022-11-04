package hello;

import java.util.Scanner;

public class hw5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the power is the index of a list
		// create an empty list[100]
		// for the 1st input, use the input as index for the list
		// add the 2nd input to the list[1st]
		// break after one loop when 1st input is 0
		// use another for loop, going from 100 to 0
		// if list[i] != 0, print(...)
		Scanner in = new Scanner(System.in);
		int input;
		int[] list = new int[101];
		do
		{
			input = in.nextInt();
			list[input] = list[input] + in.nextInt();
		} while(input!=0);
		do
		{
			input = in.nextInt();
			list[input] = list[input] + in.nextInt();
		} while(input!=0);
		for (int i =100; i>=0;i--)
		{
			if (list[i]!=0)
			{
				if (i>1)
				{
					System.out.print(list[i]+"x"+i+"+");
				}
				else if (i == 1)
				{
					System.out.print(list[i]+"x+");
				}
				else
				{
					System.out.print(list[i]);
				}
			}
		}
	}

}
