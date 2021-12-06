package com.tech.assignments;

import java.util.Scanner;

public class Program13 {
	public static class P13 {
		public static void numberToWords(int n) {
			
			
			if (n < 0) {
				System.out.println("Invalid Input");
			} else {

				switch (n) {
				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				case 3:
					System.out.println("THREE");
					break;
				case 4:
					System.out.println("FOUR");
					break;
				case 5:
 					System.out.println("FIVE");
					break;
				case 6:
					System.out.println("SIX");
					break;
				case 7:
					System.out.println("SEVEN");
					break;
				case 8:
					System.out.println("EIGHT");
					break;
				case 9:
					System.out.println("NINE");
					break;
				case 10:
					System.out.println("TEN");
					break;
				default:
					System.out.println("Other");
				}
			}

		}

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			numberToWords(x);
		}
	}
}



