package com.corejava.tcs.currency;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {

		System.out.println("Find Currency and its Country or Capital!");
		
		Scanner sc = new Scanner(System.in);
		
		//Created arrays
		String x[] = {"India", "Japan", "USA", "England", "Canada", "Australia"};
		String y[] = {"INR", "Yen", "USD", "GBP", "CAD", "AUD"};
		String z[] = {"New Delhi", "Tokyo", "Washington DC", "London", "Ottawa", "Canberra"};
		
		System.out.println("Enter the 3 digit currency code: ");
		
		String in = sc.nextLine();
		
		
		for(int i=0; i<y.length; i++){
			
			if(in.equalsIgnoreCase(y[i])){
				
				System.out.println("Hit 1 for country OR 2 for Capital: ");
				String a = sc.nextLine();
				if(a.equals("1")){
					System.out.println(x[i]);
				}else if(a.equals("2")){
					System.out.println( z[i]);
				}
				sc.close();
			
			}
		}
		
	}

}
