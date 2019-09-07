package javaTest;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char ch=in.next().charAt(0);
		char []a=str.toCharArray();
		char []b=new char[500];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ch)
			b[index++]=a[i];
		}
		str=b.toString();
		for(int i=0;i<index;i++)
			System.out.print(b[i]);
	}

}
