package com.corejava.arrays;

import java.util.Arrays;

public class SortNumericAndString {

	public static void main(String[] args) {

		int[] number_array = {5, 10, 2, 1, 8, 9, 3, 0, 4, 6, 7};
			
		String[] string_array = {"d","e","e","p","a","k","r","e","d","d","y"};
		
		System.out.println("Original number array: "+Arrays.toString(number_array));
		Arrays.sort(number_array);
		System.out.println("Sorted number array: "+Arrays.toString(number_array));
		
		System.out.println("Original String Array: "+Arrays.toString(string_array));
		Arrays.sort(string_array);
		System.out.println("Sorted String Array: "+Arrays.toString(string_array));
	}

}
