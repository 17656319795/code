package javaTest;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[10];
		int i=0;
		do{
			a[i++]=n%2;
			n/=2;
		}while(n!=0);
		for(int j=i-1;j>=0;j--)
			System.out.print(a[j]);
	}

}
