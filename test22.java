package javaTest;

import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		int c=(int)(Math.round(a*b/10)*10);
		System.out.print(c);
	}
}
