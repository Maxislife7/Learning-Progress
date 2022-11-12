package c2_week3_hw;

import java.util.Scanner;
import java.util.ArrayList;

public class Distance {
	ArrayList<String> cities = new ArrayList<String>();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public void add(String s) {
		cities.add(s);
	}
	
	public void addInt(int a) {
		nums.add(a);
	}
	
	public int getSize() {
		return cities.size();
	}
	
	public String getString(int i) {
		return cities.get(i);
	}
	
	public int getInt(int i) {
		return nums.get(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		Distance distance = new Distance();
		String s = new String();
		do {
			if(count==0)
			{
				s = in.next();
			}
			if(s.equals("###")==true)
			{
				distance.addInt(in.nextInt());
				count+=1;
			}
			else
			{
				distance.add(s);
			}
		} while(count!=(distance.getSize()*distance.getSize()));
		int result = 0;
		for (int i=0; i<2;i++) {
			String city = in.next(); 
			for (int j=0; j<distance.getSize();j++) {
				if (distance.getString(j).equals(city)) {
					if (i==0) {
						result = distance.getSize()*j;
					}
					else if (i==1) {
						result += j;
					}
				}
			}
		}
		System.out.println(distance.getInt(result));
	}

}
