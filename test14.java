package javaTest;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char []a=new char[1000];
		a=str.toCharArray();
		for(int i=0;i<a.length/2;i++)
		{
			char temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println("逆置后的数组为：");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
