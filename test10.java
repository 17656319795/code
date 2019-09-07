package javaTest;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),sum=0,cnt=0;
		for(int i=0;i<n;i++)
		{
			int t=in.nextInt();;
			sum+=t;
			if(t<60)cnt++;
		}
		System.out.print("平均成绩："+sum*1.0/n+"  不及格人数："+cnt);
	}

}
