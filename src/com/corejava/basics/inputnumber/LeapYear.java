package com.corejava.basics.inputnumber;


public class LeapYear {

	private int year;
	
	public int getA() {
		return year;
	}

	public void setA(int year) {
		this.year = year;
	}
	
	public void isLeapYear(){
		
		if(year%4 != 0){
			System.out.println("Common year: " +year);
		}else if(year%100 != 0){
			System.out.println("Leap Year: " +year);
		}else if(year%400 !=0){
			System.out.println("Common Year: "+year);
		}else{
			System.out.println("Leap Year: "+year);
		}
		
	}
	
}

