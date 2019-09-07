package javaTest;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[100];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int index=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[index])index=j;
			}
			int t=a[i];
			a[i]=a[index];
			a[index]=t;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
