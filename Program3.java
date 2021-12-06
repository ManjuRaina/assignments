package com.tech.assignments;

public class Program3 {
	public static void printEqual(int a,int b,int c) {
		if(a<0 ||b<0||c<0) {
			System.out.println("print Invalid Value");
		}else if(a==b && a==c) {
			System.out.println("all the numbers are equal");
			}else if(a==b && a!=c) {
				System.out.println("Niether all are equal or different");
				}else {
					System.out.println(" All Numbers are different");
				}
	}
public static void main(String[] args) {
	 Program3 p = new Program3();
	 Program3.printEqual(10, 20, 30 );
}


}
