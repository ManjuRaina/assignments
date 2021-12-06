package com.tech.assignments;

public class Program2 {
	public static double Area(double radius) {
		if(radius<0) {
			System.out.println(("this is negative value"));
	return -1.0;
	}
		System.out.println("radius is " +radius);
		return radius*radius*Math.PI;
	}
	
	public static double Area(int x,int y) {
	if(x<0 || y<0) {
		System.out.println(("this is negative value"));
return -1.0;
}
	System.out.println("parameter is " + x*y);
	return x*y;
}
	public static void main(String[] args) {
		Area(2);
		Area(10, 20);
	}

}
