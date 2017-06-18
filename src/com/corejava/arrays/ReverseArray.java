package com.corejava.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println("Original: "+Arrays.toString(a));
		System.out.println(a.length);
		
		for(int i=0; i<a.length / 2; i++){
			
			int temp = a[i];
			a[i] = a[a.length -i -1];
			a[a.length -i -1]= temp;
			
		}
		
		System.out.println("Reverse: "+Arrays.toString(a));
	}

}
