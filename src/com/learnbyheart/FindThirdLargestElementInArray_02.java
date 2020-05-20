package com.learnbyheart;

import java.util.Arrays;

public class FindThirdLargestElementInArray_02 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		int[] intArray = new int[] { 10, 20, 25, 63, 96, 57 };
		// sort the array
		Arrays.sort(intArray);
		
		int max = intArray[intArray.length - 3];

		System.out.println("Third largest number is:: " + max);

		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}
