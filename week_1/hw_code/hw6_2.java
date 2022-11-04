package hello;

import java.util.Scanner;

public class hw6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String result=null;
		while(true)
		{
			String a = in.nextLine();
			if (a.equals("END"))
			{
				break;
			}
			else if (a.indexOf("$GPRMC")==-1)
			{
				continue;
			}
			if (a.lastIndexOf('*')==-1)
			{
				continue;
			}
			int cc = a.lastIndexOf('*') +1;
			
			String b = a.substring(cc);
			
			int transfer = Integer.parseInt(b,16);
			char sum = a.charAt(1);
			for (int i=1;i<cc-2;i++)
			{
				sum = (char) (sum ^ a.charAt(i+1));
			}
			if (sum %65536==transfer && a.indexOf('A')!=-1)
			{
				int hh = Integer.parseInt(a.substring(7,9));
				hh = (hh+8)%24;
				if (hh<9)
				{
					result = ("0"+hh+":"+a.substring(9,11)+":"+a.substring(11,13));
					
				}
				else
				{
					result = (hh+":"+a.substring(9,11)+":"+a.substring(11,13));
				}
			}
		}
		System.out.println(result);
	}

}
