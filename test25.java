package javaTest;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [][]a=new int[500][500];
		int k=1;
		int n=in.nextInt();
		int q=n*n;
		int i=1,j=1;
		while(k<=q)
		    {
		        while(j<=n)
		        {
		            if(a[i][j]==0)
		                a[i][j++]=k++;
		            else break;
		        }
		        j--;
		        i++;
		        while(i<=n)
		        {
		            if(a[i][j]==0)
		                a[i++][j]=k++;
		            else break;
		        }
		        i--;
		        j--;
		        while(j>0)
		        {
		            if(a[i][j]==0)
		                a[i][j--]=k++;
		            else break;
		        }
		        j++;
		        i--;
		        while(i>0)
		        {
		            if(a[i][j]==0)
		                a[i--][j]=k++;
		            else break;
		        }
		        i++;
		        j++;
		    }
		for(i=1;i<=n;i++)
	    {
	        for(j=1;j<n;j++)
	            System.out.print(a[i][j]+" ");
	        System.out.print(a[i][j]+"\n");
	    }
	}

}
