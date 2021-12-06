package com.tech.assignments;

import java.util.Scanner;

public class Pgrogrm4 {
	public static void main(String[] args) {
		

		String string_arr[];
		String str = "ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE";
		string_arr = str.split(" ");
		int n[] = {0,1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Result = "+string_arr[num]);
		
	}


}
