package hello;

import java.util.Scanner;

public class hw2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word1, word2;
		int num = in.nextInt();
		int first = num/10;
		int second = num%10;
		switch(first) {
			case 1:
				word1 = "unreadable";
				break;
			case 2:
				word1 = "barely readable, occasional words distinguishable";
				break;
			case 3:
				word1="readable with considerable difficulty";
				break;
			case 4:
				word1="readable with practically no difficulty";
				break;
			default:
				word1 = "perfectly readable";
		}
		switch(second) {
			case 1:
				word2="Faint signals, barely perceptible";
				break;
			case 2:
				word2="Very weak signals";
				break;
			case 3:
				word2="Weak signals";
				break;
			case 4:
				word2="Fair signals";
				break;
			default:
				word2="Fairly good signals";
		}
		System.out.println(word2+", "+word1+".");
	}

}
