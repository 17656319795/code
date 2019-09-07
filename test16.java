package javaTest;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[100];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
