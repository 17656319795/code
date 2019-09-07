package javaTest;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(test5.iswater(i)==1)
				System.out.print(i+" ");
		}
	}
	public static int iswater(int n)
	{
		int cnt=0;
		int sum=0;
		int a=0;
		int t=n,s=n;
		do{
			a=n%10;
			n/=10;
			cnt++;
		}while(n!=0);
		do{
			sum+=(int)Math.pow(t%10, cnt);
			t/=10;
		}while(t!=0);
		if(sum==s)return 1;
		return 0;
	}
}
