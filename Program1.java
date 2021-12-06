package com.tech.assignments;

public class Program1 {
	public static String getDurationString(int minutes,int seconds){
		if(minutes>=0 && seconds>=0 && seconds<=59) {
			int hours=minutes/60;
			int remainingMinutes=(minutes%60);
			String i=hours+"h"+remainingMinutes+"m"+seconds+"s";
		
		return i;
		}else {
			return"invalid";
		}
	}
	
	public static void getDurationString(int seconds){
		if(seconds>0) {
			int correctMinutes=(seconds/60);
			int correctseconds=seconds%60;
			String i=correctMinutes+"m"+correctseconds+"s";
			System.out.println(i+"\n"+getDurationString(correctMinutes,correctseconds));
			
			
		}
		else {
			System.out.println("Invaild values");
		}
		}
	public static void main(String[] args) {
		getDurationString(2,30);
		getDurationString(45);
	}

}
