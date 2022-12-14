package coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(50, "hald-dollar");
		coinnames.put(10, "dim");
		coinnames.put(25, "quarter");

	}
	
	public String getName(int amount) {
		if (coinnames.containsKey(amount))
		{
			return coinnames.get(amount);	
		}
		else
		{
			return "Not Found";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
		
		
	}

}
