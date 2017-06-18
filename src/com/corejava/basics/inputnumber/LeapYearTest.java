package com.corejava.basics.inputnumber;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		
		LeapYear lp = new LeapYear();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter year: ");
		
		int b = sc.nextInt();
		
		lp.setA(b);
		
		lp.isLeapYear();
		
		
		}

}
