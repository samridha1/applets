package applets;

import java.util.Scanner;

public class ins {
	public static void main(String[] args){
		int n,i,flag=0,index=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of num");
		n=sc.nextInt()+1;
		System.out.println("enter the ele");
		i=sc.nextInt();
		System.out.println("enter the ele");
		index=sc.nextInt();
		
		System.out.println("enter");
		int ar[]=new int[n+1];
		for(int j=0;j<n;j++)
		{
			ar[j]=sc.nextInt();
		}
		for(int j=n-1;j>index-1;j--)
		{
			ar[j]=ar[j+1];
		}
		ar[index]=i;
		for(int j=0;j<n+1;j++)
		{
			System.out.println(ar[j]);
		}
		}

}
