package hello;

import java.util.Scanner;

public class hw6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] count = new int[100];
		int i = 0;
		String s;
		do
		{
			s = in.next();
			count[i] = s.length();
			i+=1;
		} while((s.length() - s.indexOf('.'))!=1);
		for (int x=0;x<count.length;x++)
		{
			if (count[x]!=0)
			{
				System.out.println(count[x]+" ");				
			}
		}
	}

}
