package javaTest;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入循环次数");
		int n=in.nextInt();
		String str="学习使我快乐";
		for(int i=0;i<n;i++)
		{
			System.out.println(str);
		}
		study me=new study();
		me.read();
		me.write();
		me.read("敲代码");
		me=null;
		System.gc();
	}

}
class study{
	private String str="我爱";
	public void read(){
		System.out.println("我爱读书");
	}
	public void write(){
		System.out.println("我爱写字");
	}
	public void read(String str){
		System.out.println(this.str+str);
	}
	public void finalize(){
		System.out.println("就算我不在了我也依然爱学习");
	}
}
