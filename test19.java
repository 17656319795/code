package javaTest;

import java.util.Scanner;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String stra="",strb="";
		stra=in.next();
		strb=in.next();
		char a=stra.charAt(stra.length()-1);
		char b=strb.charAt(0);
		
		if(a==b)
		{
			stra=stra.substring(0, stra.length()-1);
		}
		System.out.print(stra+strb);
	}

}
