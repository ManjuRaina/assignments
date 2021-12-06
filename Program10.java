package com.tech.assignments;

public class Program10 {

	public boolean hasSharedDigit(int x, int y) {
		int firstnumberfirstdigit = x / 10;
		int firstnumberlastdigit = x % 10;
		int secondnumberfirstdigit = y / 10;
		int secondnumberlastdigit = y % 10;
		boolean result=true;
		
		if (x < 10 || x > 99 || y < 10 || y > 99) {
			result=false;
		} 
			
		else if (firstnumberfirstdigit == secondnumberfirstdigit || firstnumberfirstdigit == secondnumberlastdigit
					|| firstnumberlastdigit == secondnumberlastdigit) {
			result=true;
			}
			else {
				result=false;
			}
		return result;

		}

	

	public static void main(String[] args) {
		Program10  p = new  Program10();
		System.out.println(p.hasSharedDigit(21,78));
	}


}
