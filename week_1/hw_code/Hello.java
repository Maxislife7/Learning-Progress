package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		Scanner in = new Scanner(System.in);
////		System.out.println("echo:" + in.nextLine());
//		int price = 0;
//		int amount = 100;
//		System.out.print("plz enter money:");
//		amount = in.nextInt();
//		System.out.print("plz enter price:");
//		price = in.nextInt();
//		System.out.println(amount+"-"+price+"="+(amount-price));
		int foot;
		int inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
	
	}

}
