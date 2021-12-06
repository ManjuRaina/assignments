 package com.tech.assignments;

public class Fib {
	public static void main(String[] args)

	{

		int n = 10;
		int fn[] = new int[n];
		fn[0] = 0;
		fn[1] = 1;
		System.out.print(fn[0]+","+ fn[1]+",");
		for (int i = 2; i < n; i++) 
		 {
			fn[i] = fn[i-1] + fn[i-2];
			fn[0] = fn[1];
			fn[1] = fn[i];
			System.out.print(fn[i]+",");
			
			
		}

	}

}
