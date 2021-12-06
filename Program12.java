package com.tech.assignments;

public class Program12 {
	
	    static void printFactors(int n){
	    	if(n>=1) {
	    		for(int i=1;i<=n;i++) {
	    			if(n%i==0) {
	    				System.out.println(i);
	    			}
	    		}
	    	}
	    	else
	    		System.out.println("invalid value");;
	    }
	    
	    public static void main(String[] args) {
			printFactors(36);
		}
	    
	}


