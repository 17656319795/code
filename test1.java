package javaTest;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int min=0;
		int max=0;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			temp=in.nextInt();
			if(i==0)
			{
				min=temp;
			}
			if(temp>max)max=temp;
			if(temp<min)min=temp;
		}
		System.out.print("min="+min+",max="+max);
	}

}
