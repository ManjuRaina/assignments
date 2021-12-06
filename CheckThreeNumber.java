 package com.tech.assignments;

import java.util.Scanner;

public class CheckThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3)
			{
				count++;
			}
		}
		System.out.println(a.length);
		if(count==3)
		{
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
	}

}
