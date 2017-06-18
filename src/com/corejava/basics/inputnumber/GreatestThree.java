package com.corejava.basics.inputnumber;

import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a: ");
		int a = sc.nextInt();
		
		System.out.println("Input b: ");
		int b = sc.nextInt();
		
		System.out.println("Input c: ");
		int c = sc.nextInt();
		
		greatestNumber(a, b, c);
	}

	public static int greatestNumber(int a, int b, int c) {
		if(a > b){
			if(a > c){
				return a;
			}
		}
		
		if(b>c)
			if(b>a){
				return b;
			}
		
		if(c>a)
			if(c>b){
				return c;
			}
		return a;
	}

}
