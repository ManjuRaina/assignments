package com.tech.assignments;

public class program8 {

		public static void main(String[] args) {
			

			int number = 76895;
			int last_digit = number%10;
			number/=10;
			
			while(number>9){
				number/=10;
			}
			System.out.println("Sum of first digit and last digit = "+(last_digit+number));	
		}
	}



