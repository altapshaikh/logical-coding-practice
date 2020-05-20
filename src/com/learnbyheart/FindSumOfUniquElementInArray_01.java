package com.learnbyheart;

import java.util.Arrays;

public class FindSumOfUniquElementInArray_01 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		int[] intArray = new int[] { 4, 5, 6, 7, 8, 4, 6, 7 };
		// sort the array
		Arrays.sort(intArray);
		
		int current = intArray[0];
		
		int sum = intArray[0];
		
		for (int i = 0; i < intArray.length; i++) {
			
			if (current != intArray[i]) {
				sum += intArray[i];
				current = intArray[i];
			}
			
		}
		System.out.println("sum of unique element:: " + sum);
		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}
