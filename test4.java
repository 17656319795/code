package javaTest;

import java.util.Scanner;

public class test4 {

	private static int isprime(int a)
	{
		if(a<2)return 0;
		int sq=(int)Math.sqrt(a);
		for(int i=2;i<=sq;i++)
		{
			if(a%i==0)return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(test4.isprime(i)==1)
			{
				System.out.print(i+" ");
			}
		}
	}
	

}
