package javaTest;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int flag=1;
		double sum=0;
		int down=1;
		for(int i=0;i<n;i++)
		{
			sum+=1.0/down*flag;
			down+=2;
			flag*=-1;
		}
		System.out.print(sum);
	}

}
