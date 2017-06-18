package com.corejava.arrays;

public class ContainsArray {

	public static boolean contains(int[] array, int n){
	
		for(int i: array){
			if(n ==i){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {

		int[] array = {15, 27, 90, 29 , 7};
		
		System.out.println(contains(array, 7));
		System.out.println(contains(array, 9));
	}

}
