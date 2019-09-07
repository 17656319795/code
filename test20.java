package javaTest;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int length=0;
		char []a=new char[500];
		a=str.toCharArray();
//		int i=0;
		for(char ch:a)
		{
			length++;
		}
		System.out.print(length);
	}

}
