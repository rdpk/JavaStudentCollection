package com.corejava.basics.inputnumber;

import java.util.Scanner;

public class PositveOrNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input: ");
		int a = sc.nextInt();
		
		if(a > 0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}

}
