package javaTest;

import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int cnt=0;
		int flag=1;
		int [][]a=new int[50][50];
		for(int i=0;i<n;i++)
		{
			if(flag%2==1)
			for(int j=0;j<n;j++)
			{
				a[i][j]=++cnt;
			}
			else
			{
				for(int j=n-1;j>=0;j--)
				{
					a[i][j]=++cnt;
				}
			}
			flag++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
				if(j==n-1)System.out.println();
				else
					System.out.print(' ');
			}
		}
	}
}
