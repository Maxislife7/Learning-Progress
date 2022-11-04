package hello;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Initial
		Scanner in = new Scanner(System.in);
		int balance = 0;
//		Read in money order
		while (true)
		{	
			System.out.print("Plz insert money: ");
			int amount = in.nextInt();
			balance = balance + amount;
			if (amount >= 10)
			{
		//		print ticket
				System.out.println("*****************");
				System.out.println("*Java metro lane*");
				System.out.println("*   ticket $10  *");
				System.out.println("*****************");
		//		Calculate and return change
				System.out.println("change: " + (balance-10) );
				balance = 0;
			}
			else
			{
			}
		}
	}

}
