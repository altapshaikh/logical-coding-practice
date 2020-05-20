package com.learnbyheart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementInArray_03 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		Integer[] intArray = new Integer[] { 4, 5, 6, 7, 8, 4, 6, 7 };

		// this array has duplicate element
		System.out.println(Arrays.toString(intArray));

		List<Integer> numbersWithoutDuplicates = Arrays.asList(intArray).stream().distinct()
				.collect(Collectors.toList());
		
		// Verify the array content
		System.out.println(numbersWithoutDuplicates);

		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}
