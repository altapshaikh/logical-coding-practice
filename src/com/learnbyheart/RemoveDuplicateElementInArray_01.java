package com.learnbyheart;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementInArray_01 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		Integer[] intArray = new Integer[] { 4, 5, 6, 7, 8, 4, 6, 7 };

		// this array has duplicate element
		System.out.println(Arrays.toString(intArray));

		// convert array to linked hash set
		LinkedHashSet<Integer> hashset = new LinkedHashSet<>(Arrays.asList(intArray));

		// go back to array without duplication
		Integer[] numbersWithoutDuplicates = hashset.toArray(new Integer[] {});
		
		// Verify the array content
		System.out.println(Arrays.toString(numbersWithoutDuplicates));
		
		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}
