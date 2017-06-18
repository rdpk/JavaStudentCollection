package com.corejava.basics.inputnumber;

import java.util.Scanner;

public class UserInput {

	
	static int a;
	static int b;
	
	public int product(){
		
		int result = a*b;
		
		return result;
	}
	public static void main(String[] args) {

		UserInput uin = new UserInput();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First number: ");
			a = sc.nextInt();
			
		System.out.println("Second number: ");
			b = sc.nextInt();
		
		System.out.println("Product of "+a + " and "+b +" is "+ uin.product());
	}

}
