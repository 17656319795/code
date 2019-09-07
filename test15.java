package javaTest;

import java.util.Scanner;

public class test15 {
	public static int []fib=new int[1000000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<1000000;i++)
			fib[i]=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("f("+i+")="+test15.f(i));
		}
	}
	
	public static int f(int a)
	{
		if(fib[a]!=0)
		{
			return fib[a];
		}
		else
			return fib[a]=f(a-1)+f(a-2);
	}
}
