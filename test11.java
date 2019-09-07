package javaTest;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str="";
		System.out.println("请输入10个字符（含空格）");
		str=in.nextLine();
		int letter=0,oth=0,num=0;
		do{
			if(str.length()!=10)
			{
				System.out.println("输入字符个数错误请重新输入");
				str=in.nextLine();
			}	
		}while(str.length()!=10);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				letter++;
			else if(ch>='0'&&ch<='9')num++;
			else
				oth++;
		}
		System.out.print("数字字符个数："+num+" 字母个数："+letter+" 其他字符个数"+oth);
	}

}
