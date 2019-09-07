package javaTest;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int min=0;
		int max=0;
		int temp=0;
		int sum=0;
		for(int i=0;i<10;i++)
		{
			temp=in.nextInt();
			if(i==0)
			{
				min=temp;
			}
			if(temp>max)max=temp;
			if(temp<min)min=temp;
			sum+=temp;
		}
		sum-=max;
		sum-=min;
		System.out.print(sum*1.0/8);
	}
}
