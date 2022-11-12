package c2_week1_hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(), in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}

}

class Fraction {
	int m,n;
	
	Fraction()
	{
		this.m=1;
		this.n=1;
	}
	
	Fraction(int a, int b)
	{
		for (int i=2; i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				a/=i;
				b/=i;
			}
		}
		m=a;
		n=b;
	}
	
	Fraction minimize(Fraction x)
	{
		for (int i=2; i<=x.m;i++)
		{
			if(x.m%i==0 && x.n%i==0)
			{
				x.m/=i;
				x.n/=i;
			}
		}
		return x;
	}
	
	
	double toDouble()
	{
		return (double)(m/n);
		
	}

//    将分数转换为double

	Fraction plus(Fraction r)
	{
		Fraction x = new Fraction();
		if(r.n==this.n)
		{
			x.m=this.m+r.m;
			x.n=this.n;
		}
		else
		{
			x.n=this.n*r.n;
			x.m=this.m*r.n+this.n*r.m;
		}
		minimize(x);
		return x;
	}

//    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。

	Fraction multiply(Fraction r)
	{
		Fraction x = new Fraction();
		x.m = this.m*r.m;
		x.n=this.n*r.n;
		minimize(x);
		return x;
	}

//    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。

	void print()
	{
		if(this.m==this.n)
		{
			System.out.println(1);			
		}
		else
		{
			System.out.println(this.m+"/"+this.n);
		}
	}

//    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
}
