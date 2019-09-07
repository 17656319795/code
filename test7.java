package javaTest;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.print(test7.fact(n));
	}
	public static int fact(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
			sum*=i;
		return sum;
	}
}
