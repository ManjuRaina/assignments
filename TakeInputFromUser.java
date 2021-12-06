package com.tech.assignments;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enetr number elements to add");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("enter elements to a array");
	  
	 int sum=0;
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
		 sum=sum+a[i];
		 
	 }
	  
System.out.println(sum);
	}

}
