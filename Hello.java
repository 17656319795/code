package javaTest;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������ѭ������");
		int n=in.nextInt();
		String str="ѧϰʹ�ҿ���";
		for(int i=0;i<n;i++)
		{
			System.out.println(str);
		}
		study me=new study();
		me.read();
		me.write();
		me.read("�ô���");
		me=null;
		System.gc();
	}

}
class study{
	private String str="�Ұ�";
	public void read(){
		System.out.println("�Ұ�����");
	}
	public void write(){
		System.out.println("�Ұ�д��");
	}
	public void read(String str){
		System.out.println(this.str+str);
	}
	public void finalize(){
		System.out.println("�����Ҳ�������Ҳ��Ȼ��ѧϰ");
	}
}
