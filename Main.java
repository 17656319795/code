package javaTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int j=0;j<n;j++)
		{
			String str=in.nextLine();
			System.out.println(str);
			str=str.replace("I", "you");
			str=str.replace("me", "you");
			str=str.replace("?", "!");
			str=str.replace(" ", "&");
			String str2[]=str.split("&");
			int i=0;
			String str3="";
			for(String a:str2)
			{
				if(str2[i].contains(" ")!=true)
				str3=str3+" "+str2[i++];
			}
			str3=str3.replace("can you", "I can");
			str3=str3.replace("could you", "I could");
//			str2[i-1]=str2[i-1].replace(" ","");
			System.out.print("AI:"+str3);
			System.out.print('\n');
		}
	}

}
