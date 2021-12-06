 package com.tech.assignments;
import java.math.*;
public class FabArray 
{
static boolean 	isPerfectSquare(int num) {
	int n=(int) (Math.sqrt(num));
	return(n*n==num);
}
	
	
	static void checkFib(int array[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(isPerfectSquare(5*array[i]*array[i]+4) || isPerfectSquare(5*array[i]*array[i]-4))
			{
				System.out.println(array[i]+ " ");
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("not present");
		}
		
	}
	public static void main(String[] args) 
	{
      int array[]= {0,1,1,2,3,5,8,13,21,34};
      int n=array.length;
      checkFib(array,n);

	}

}
