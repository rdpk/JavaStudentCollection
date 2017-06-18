package com.corejava.basics.inputnumber;

import java.util.Scanner;

public class BodyMass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input weight in pounds: ");
		double weight = sc.nextDouble();
		
		System.out.println("Input Height in inches: ");
		double height = sc.nextDouble();
		
		double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254); 
		System.out.println("Body Index is: " +BMI);
	}

}
