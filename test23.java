package javaTest;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("请输入矩阵的行数（列数）");
		a=in.nextInt();
		b=a;
		int [][]s=new int[50][50];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
				s[i][j]=in.nextInt();
		}
		for(int i=a-1;i>=0;i--)
		{
			for(int j=b-1;j>=0;j--)
			{
				System.out.print(s[j][i]);
				if(j==0)System.out.println();
				else
					System.out.print(' ');
			}
				
		}
	}

}
