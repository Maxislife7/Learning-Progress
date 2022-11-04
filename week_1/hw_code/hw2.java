package hello;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int bjt = in.nextInt();
		if (bjt <=800 )
		{
			System.out.println(bjt+1600);
		}
		else
		{
			System.out.println(bjt-800);
		}
	}

}
