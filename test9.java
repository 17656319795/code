package javaTest;

import java.util.Random;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=(int)(Math.random()*100);
//		System.out.print(a);
		int my=in.nextInt();
		if(my==a)System.out.print("猜中");
		else if(my<a){
			System.out.print("您输入的数小于计算机产生的随机数");
		}
		else
			System.out.print("您输入的数大于计算机产生的随机数");
	}

}
