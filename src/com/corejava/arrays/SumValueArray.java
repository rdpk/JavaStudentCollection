package com.corejava.arrays;

public class SumValueArray {

	public static void main(String[] args) {

		int[] number = {2, 3, 4, 5, 6, 8};
		
		int sum=0;
		
		for(int i: number){
			sum += i;
			
			System.out.println("sum is: "+sum);
		}
	}

}
